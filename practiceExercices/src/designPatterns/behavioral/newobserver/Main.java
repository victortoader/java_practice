package designPatterns.behavioral.newobserver;



//Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
//Subject contains a list of observers to notify of any change in it’s state, so it should provide methods using which observers can register and unregister themselves.
// Subject also contain a method to notify all the observers of any change and either it can send the update while notifying the observer or it can provide another method to get the update.
//
//Observer should have a method to set the object to watch and another method that will be used by Subject to notify them of any updates.
//
//Java provides inbuilt platform for implementing Observer pattern through java.util.Observable class and java.util.Observer interface.
// However it’s not widely used because the implementation is really simple and most of the times we don’t want to end up extending a class just for implementing Observer pattern as
// java doesn’t provide multiple inheritance in classes.

public class Main {


    public static void main (String[] args)
    {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setGoogPrice(154.4);
        stockGrabber.setAapPrice(200);
        stockGrabber.setIbmPrice(500);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);

        // Call for the code in run to execute

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();



    }



}
