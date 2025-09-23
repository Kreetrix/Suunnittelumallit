package Assignment_14;

public interface ComputerBuilder {
    ComputerBuilder buildProcessor(String cpu);

    ComputerBuilder buildRAM(int ram);

    ComputerBuilder buildHardDrive(String hdd);

    ComputerBuilder buildGraphicsCard(String gpu);

    ComputerBuilder buildOperatingSystem(String os);

    Computer getComputer();

}
