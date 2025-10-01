package Assignment_19;

public interface MediatorInterface {
    void sendMessage(String message, Client sender, String recipient);

    void addClient(Client client);
}
