package Assignment_6;

public abstract class BasePrinter implements Printer {
    private final Printer wrapped;

    BasePrinter(Printer wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void print(String message) {
        wrapped.print(message);
    }
}
