package Assignment_10.handlers;

import Assignment_10.Handler;
import Assignment_10.Message;
import Assignment_10.MessageType;

public class CompensationHandler extends Handler {

    @Override
    public boolean handle(Message message) {
        if (message.getMessageType() == MessageType.COMPENSATION) {
            System.out.printf("\nHandling compensation claim from %s with message - %s", message.getEmail(),
                    message.getContent());
            return true;
        }
        return super.handleNext(message);
    }

}
