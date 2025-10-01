package Assignment_19;

import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    protected String[] names = { "Amir", "Matti", "Vesa" };

    @Override
    public void start(Stage primaryStage) {
        ChatMediator mediator = new ChatMediator();

        for (String name : this.names) {
            createClientWindow(name, mediator);
        }
    }

    private void createClientWindow(String username, ChatMediator mediator) {
        Client client = new Client(username, mediator);
        String[] usernameArray = Arrays.stream(names)
                .filter(name -> !name.equals(username))
                .toArray(String[]::new);
        client.addRecipients(usernameArray);
        VBox layout = new VBox(5);
        layout.getChildren().addAll(
                client.getChatArea(),
                new Label("Recipient:"),
                client.getRecipientField(),
                new Label("Message:"),
                client.getMessageField(),
                client.getSendButton());

        Stage stage = new Stage();
        stage.setTitle(username + "'s Chat Window");
        stage.setScene(new Scene(layout, 400, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
