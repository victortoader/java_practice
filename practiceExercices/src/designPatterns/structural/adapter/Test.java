package designPatterns.structural.adapter;

//used so that two unrelated interfaces can work together.
//One of the great real life example of Adapter design pattern is mobile charger.
// Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India).
// So the mobile charger works as an adapter between mobile charging socket and the wall socket.

public class Test {

    public static void main(String [] args) {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();

        System.out.println("v3 volts using Object Adapter="+v3.getVolts());
        System.out.println("v12 volts using Object Adapter="+v12.getVolts());
        System.out.println("v120 volts using Object Adapter="+v120.getVolts());
    }
}
