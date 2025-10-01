package Assignment_19;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements MediatorInterface {
    private List<Client> clients = new ArrayList<>();

    @Override
    public void sendMessage(String message, Client sender, String recipient) {

        for (Client client : clients) {
            if (client.getUsername().equals(recipient)) {
                client.receiveMessage(sender.getUsername(), message);
            }
        }
    }

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

}
