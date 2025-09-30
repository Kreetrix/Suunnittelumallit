package Assignment_16;

import Assignment_16.devices.Device;
import Assignment_16.devices.Radio;
import Assignment_16.devices.SmartTV;
import Assignment_16.devices.Tv;
import Assignment_16.remotes.AdvancedRemote;
import Assignment_16.remotes.BasicRemote;
import Assignment_16.remotes.SmartRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
        testDevice(new SmartTV());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

        System.out.println("Tests with smart remote.");
        SmartRemote smartRemote = new SmartRemote(device);
        smartRemote.voiceControl("Turn on TV");
        smartRemote.voiceControl("Turn off TV");
        smartRemote.voiceControl("Hello");
        smartRemote.openBrowser();
        device.printStatus();
    }
}