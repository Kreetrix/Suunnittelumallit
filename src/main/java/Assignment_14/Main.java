package Assignment_14;

import Assignment_14.builders.GamingComputerBuilder;
import Assignment_14.builders.OfficeComputerBuilder;

public class Main {
    public static void main(String[] args) {
        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector();

        director.buildGamingComputer(gamingBuilder);
        Computer pc = gamingBuilder.getComputer();
        System.out.println(pc);

        OfficeComputerBuilder officeBuilder = new OfficeComputerBuilder();
        director.buildOfficeComputer(officeBuilder);
        pc = officeBuilder.getComputer();
        System.out.println(pc);
    }
}
