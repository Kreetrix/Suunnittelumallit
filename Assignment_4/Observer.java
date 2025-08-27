public class Observer extends AbstractObserver {

    public Observer(String name) {
        super(name);
    }

    @Override
    public void displayMessage(int temp) {
        System.out.println(this.name + " observes temperature -> " + temp);
    }

}
