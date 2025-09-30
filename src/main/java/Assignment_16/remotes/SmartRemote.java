package Assignment_16.remotes;

import Assignment_16.devices.Device;

public class SmartRemote extends BasicRemote {

    public SmartRemote(Device device) {
        super.device = device;
    }

    public void openBrowser() {
        this.device.browseInternet();
    }

    public void voiceControl(String command) {
        switch (command) {
            case "Turn on TV":
                System.out.println("Turning on Tv...");
                device.enable();
                break;
            case "Turn off TV":
                System.out.println("Turning off Tv...");
                device.disable();
                break;
            case "Go home":
                System.out.println("Going to home channel...");
                device.setChannel(1);
                break;
            case "Mute tv":
                System.out.println("Muting Tv...");
                device.setVolume(0);
                break;
            default:
                System.out.println("Command not recognized");
                break;
        }
    }
}
