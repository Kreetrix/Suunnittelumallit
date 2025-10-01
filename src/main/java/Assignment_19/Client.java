package Assignment_19;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Client {
    private String username;
    private ChatMediator mediator;

    private TextArea chatArea;
    private TextField messageField;
    private ChoiceBox<String> recipientField;
    private Button sendButton;

    public Client(String username, ChatMediator mediator) {
        this.username = username;
        this.mediator = mediator;
        mediator.addClient(this);

        setupUI();
    }

    private void setupUI() {
        chatArea = new TextArea();
        chatArea.setEditable(false);

        messageField = new TextField();
        recipientField = new ChoiceBox<String>();

        sendButton = new Button("Send");
        sendButton.setOnAction(e -> {
            String message = messageField.getText();
            String recipient = recipientField.getValue();
            if (!message.isEmpty() && !recipient.isEmpty()) {
                mediator.sendMessage(message, this, recipient);
                chatArea.appendText("Me to " + recipient + ": " + message + "\n");
                messageField.clear();
            }
        });
    }

    public String getUsername() {
        return username;
    }

    public void receiveMessage(String sender, String message) {
        chatArea.appendText(sender + ": " + message + "\n");
    }

    public TextArea getChatArea() {
        return chatArea;
    }

    public void addRecipients(String[] usernames) {
        recipientField.getItems().addAll(usernames);
    }

    public TextField getMessageField() {
        return messageField;
    }

    public ChoiceBox<String> getRecipientField() {
        return recipientField;
    }

    public Button getSendButton() {
        return sendButton;
    }
}
