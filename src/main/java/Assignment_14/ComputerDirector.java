package Assignment_14;

public class ComputerDirector {

    public void buildGamingComputer(ComputerBuilder builder) {
        builder.buildProcessor("Ryzen 9")
                .buildRAM(32)
                .buildHardDrive("2TB NVMe")
                .buildGraphicsCard("RTX 5080")
                .buildOperatingSystem("windows");
    }

    public void buildOfficeComputer(ComputerBuilder builder) {
        builder.buildProcessor("Pentium integrated graphics or something")
                .buildRAM(16)
                .buildHardDrive("2TB NVMe")
                .buildOperatingSystem("windows");
    }

}
