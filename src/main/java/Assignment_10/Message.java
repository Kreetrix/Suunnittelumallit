package Assignment_10;

public class Message {
    MessageType messageType;
    String content;
    String email;

    public Message(MessageType messageType, String content, String email) {
        this.messageType = messageType;
        this.content = content;
        this.email = email;
    }

    public MessageType getMessageType() {
        return this.messageType;
    }

    public String getContent() {
        return this.content;
    }

    public String getEmail() {
        return this.email;
    }

}
