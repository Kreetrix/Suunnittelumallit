package Assignment_22;

import Assignment_22.commands.MoveCursorDownCommand;
import Assignment_22.commands.MoveCursorLeftCommand;
import Assignment_22.commands.MoveCursorRightCommand;
import Assignment_22.commands.MoveCursorUpCommand;
import Assignment_22.commands.TogglePixelCommand;
import Assignment_22.commands.WriteCodeCommand;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyCode;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

// I use mvn javafx:run to run it
public class Main extends Application {
    private PixelGrid pixelGrid = new PixelGrid();
    private Rectangle[][] rectangles = new Rectangle[8][8];

    private Command moveUp = new MoveCursorUpCommand(pixelGrid);
    private Command moveDown = new MoveCursorDownCommand(pixelGrid);
    private Command moveLeft = new MoveCursorLeftCommand(pixelGrid);
    private Command moveRight = new MoveCursorRightCommand(pixelGrid);
    private Command toggle = new TogglePixelCommand(pixelGrid);
    private Command write = new WriteCodeCommand(pixelGrid);

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        GridPane gridPane = new GridPane();

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle rect = new Rectangle(50, 50);
                rect.setFill(Color.WHITE);
                rect.setStroke(Color.GRAY);
                rect.setStrokeWidth(1);
                rectangles[row][col] = rect;
                gridPane.add(rect, col, row);
            }
        }

        Button button = new Button("Write to cmd");
        button.setOnAction(e -> write.execute());
        button.setFocusTraversable(false);

        Label label1 = new Label("Press Q or SPACE to mark");
        Label label2 = new Label("Move with WASD or Arrows");

        root.getChildren().addAll(gridPane, button, label1, label2);

        Scene scene = new Scene(root, 400, 500);
        scene.setOnKeyPressed(e -> {
            Command com = null;
            if (e.getCode() == KeyCode.UP || e.getCode() == KeyCode.W) {
                com = moveUp;
            } else if (e.getCode() == KeyCode.DOWN || e.getCode() == KeyCode.S) {
                com = moveDown;
            } else if (e.getCode() == KeyCode.LEFT || e.getCode() == KeyCode.A) {
                com = moveLeft;
            } else if (e.getCode() == KeyCode.RIGHT || e.getCode() == KeyCode.D) {
                com = moveRight;
            } else if (e.getCode() == KeyCode.SPACE || e.getCode() == KeyCode.Q) {
                com = toggle;
            }
            if (com != null) {
                com.execute();
                updateGUI();
            }
        });

        stage.setScene(scene);
        stage.setTitle("Test");
        stage.show();
        updateGUI();
    }

    private void updateGUI() {
        int cx = pixelGrid.getCursorX();
        int cy = pixelGrid.getCursorY();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle rect = rectangles[row][col];
                rect.setFill(pixelGrid.isPixelOn(row, col) ? Color.BLACK : Color.WHITE);
                if (row == cy && col == cx) {
                    rect.setStroke(Color.RED);
                    rect.setStrokeWidth(2);
                } else {
                    rect.setStroke(Color.GRAY);
                    rect.setStrokeWidth(1);
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}