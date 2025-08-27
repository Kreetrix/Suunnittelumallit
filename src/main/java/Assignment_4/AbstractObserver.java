package Assignment_4;

public abstract class AbstractObserver {
    protected String name;

    public AbstractObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void displayMessage(int temp);
}
