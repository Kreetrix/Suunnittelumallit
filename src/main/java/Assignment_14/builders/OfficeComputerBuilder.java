package Assignment_14.builders;

import Assignment_14.Computer;
import Assignment_14.ComputerBuilder;

public class OfficeComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public ComputerBuilder buildProcessor(String cpu) {
        computer.setProcessor(cpu);
        return this;
    }

    @Override
    public ComputerBuilder buildRAM(int ram) {
        computer.setRam(ram);
        return this;
    }

    @Override
    public ComputerBuilder buildHardDrive(String hdd) {
        computer.setHardDrive(hdd);
        return this;
    }

    @Override
    public ComputerBuilder buildGraphicsCard(String gpu) {
        computer.setGraphicsCard(gpu);
        return this;
    }

    @Override
    public ComputerBuilder buildOperatingSystem(String os) {
        computer.setOperatingSystem(os);
        return this;
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }

}
