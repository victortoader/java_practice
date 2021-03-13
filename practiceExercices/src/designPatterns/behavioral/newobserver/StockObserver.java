package designPatterns.behavioral.newobserver;

public class StockObserver implements Observer {

    private StockGrabber stockGrabber;


    private double ibmPrice;
    private double googPrice;
    private double aapPrice;

    public double getIbmPrice() {
        return ibmPrice;
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
    }

    public double getGoogPrice() {
        return googPrice;
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
    }

    public double getAapPrice() {
        return aapPrice;
    }

    public void setAapPrice(double aapPrice) {
        this.aapPrice = aapPrice;
    }

    public static int observerTrackerID =0;
    public int observerId;


    public StockObserver(StockGrabber stockGrabber)
    {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerTrackerID;
        this.stockGrabber.register(this);
        System.out.println("Created new observer with id= "+this.observerId);
    }


    public int getObserverId() {
        return observerId;
    }

    public void setObserverId(int observerId) {
        this.observerId = observerId;
    }

    @Override
    public void update(double ibmPrice, double aapPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aapPrice = aapPrice;
        this.googPrice = googPrice;
        printPrices();
    }

    private void printPrices() {
        System.out.println(observerId+"\n IBM Price : "+ ibmPrice+ "\n Apple Price : "+ aapPrice + "\n Google Price : " + googPrice+ "\n");
    }
}
