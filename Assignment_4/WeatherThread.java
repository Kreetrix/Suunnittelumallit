
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherThread extends Thread {

    protected int temp;
    private int lowest;
    private int highest;
    private Random random;

    private List<AbstractObserver> observers;

    WeatherThread() {
        this.temp = 15;
        this.lowest = -40;
        this.highest = 40;
        this.random = new Random();
        this.observers = new ArrayList<>();
    }

    @Override
    public void run() {
        while (true) {
            try {
                int increment = random.nextBoolean() ? 1 : -1;

                if (this.temp >= this.highest)
                    increment = -1;
                if (this.temp <= this.lowest)
                    increment = 1;

                this.temp += increment;

                this.Message();

                Thread.sleep(3000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void remove(AbstractObserver o) {
        synchronized (observers) {
            this.observers.remove(o);
        }
        System.out.println("Station removed " + o.getName());
    }

    public void add(AbstractObserver o) {
        synchronized (observers) {
            this.observers.add(o);
        }
        System.out.println("Station added " + o.getName());
    }

    public void Message() {
        synchronized (observers) {
            for (AbstractObserver o : observers) {
                o.displayMessage(this.temp);
            }
        }
    }

    public int getTemp() {
        return this.temp;
    }
}
