package Assignment_10;

public abstract class Handler {
    private Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(Message message);

    protected boolean handleNext(Message message) {
        if (next == null) {
            return true;
        }
        return next.handle(message);
    }
}
