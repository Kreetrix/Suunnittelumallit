package Assignment_10;

import Assignment_10.handlers.CompensationHandler;
import Assignment_10.handlers.ContactHandler;
import Assignment_10.handlers.GeneralHandler;

public class Main {
    public static void main(String[] args) {
        Message message_1 = new Message(MessageType.COMPENSATION, "Please compensate", "comp@email");
        Message message_2 = new Message(MessageType.CONTACT, "Please contact", "contact@email");
        Message message_3 = new Message(MessageType.GENERAL, "My final message", "general@email");

        Handler compensationHandler = new CompensationHandler();
        Handler contactHandler = new ContactHandler();
        Handler generalHandler = new GeneralHandler();

        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(generalHandler);

        compensationHandler.handle(message_1);
        compensationHandler.handle(message_2);
        compensationHandler.handle(message_3);

    }
}
