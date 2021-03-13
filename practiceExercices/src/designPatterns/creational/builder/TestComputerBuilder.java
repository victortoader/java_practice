package designPatterns.creational.builder;

//Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a
// method that will actually return the final Object.

public class TestComputerBuilder {

    public static void main(String[] args) {

        Computer comp=new Computer.ComputerBuilder("500GB", "2GB").setBluetoothEnabled(true).setGraphicCardEnabled(true).build();
    }
}
