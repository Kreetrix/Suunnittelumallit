package Assignment_16.devices;

public class SmartTV extends Tv {

    public SmartTV() {
        super();
    }

    @Override
    public void browseInternet() {
        System.out.println("Opening browser...");
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm a smart TV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }

}
