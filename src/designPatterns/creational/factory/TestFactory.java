package designPatterns.creational.factory;

//The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class.
// This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.

public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2GB", "500GB","2.4Ghz");
        Computer server = ComputerFactory.getComputer("server", "12GB", "5000GB","5.4Ghz");
        System.out.println(pc);
        System.out.println(server);
    }
}
