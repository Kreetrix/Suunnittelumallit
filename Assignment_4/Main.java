
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting weather station...");
        WeatherThread station = new WeatherThread();
        station.start();

        Observer observer_1 = new Observer("Observer 1");
        Observer observer_2 = new Observer("Observer 2");
        Observer observer_3 = new Observer("Observer 3");

        System.out.println(observer_3.getName());

        station.add(observer_1);
        station.add(observer_2);
        station.add(observer_3);

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        station.remove(observer_2);
        station.remove(observer_3);

    }
}
