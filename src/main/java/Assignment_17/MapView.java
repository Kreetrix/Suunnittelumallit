package Assignment_17;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MapView extends Application {
    private static final int TILE_SIZE = 80;
    private Game game = new Game();
    private final int CANVAS_WIDTH = game.getGridWidth() * TILE_SIZE;
    private final int CANVAS_HEIGHT = game.getGridHeight() * TILE_SIZE;
    private Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
    private GraphicsContext gc = canvas.getGraphicsContext2D();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Map");
        game.main();
        drawTiles();

        javafx.scene.Scene scene = new javafx.scene.Scene(new javafx.scene.Group(canvas));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawTiles() {
        gc.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
        for (int i = 0; i < game.getGridHeight(); i++) {
            for (int j = 0; j < game.getGridWidth(); j++) {
                Image imageToDraw = game.getTreeImage(i, j);
                if (imageToDraw != null) {
                    gc.drawImage(imageToDraw, j * TILE_SIZE, i * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
