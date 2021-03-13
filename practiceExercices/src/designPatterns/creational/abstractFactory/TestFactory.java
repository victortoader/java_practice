package designPatterns.creational.abstractFactory;



// This factory class returns different subclasses based on the input provided and factory class uses if-else or switch statement to achieve this.

public class TestFactory {

    public static void main(String[] args) {
        designPatterns.creational.abstractFactory.Computer pc= ComputerFactory.getComputer(new PCFactory("2GB", "500GB","2.4Ghz"));
        designPatterns.creational.abstractFactory.Computer server= ComputerFactory.getComputer(new ServerFactory("2GB", "500GB","2.4Ghz"));

        System.out.println(pc);
        System.out.println(server);
    }
}
