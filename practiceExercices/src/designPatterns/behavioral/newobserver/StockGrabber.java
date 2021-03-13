package designPatterns.behavioral.newobserver;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    ArrayList<Observer> observers;

    public double ibmPrice;
    public double aapPrice;
    public double googPrice;

    public double getIbmPrice() {
        return this.ibmPrice;
    }

    public void setIbmPrice(double newIbmPrice) {
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }

    public  double getAapPrice() {
        return aapPrice;
    }

    public void setAapPrice(double newAapPrice) {
        this.aapPrice = newAapPrice;
        notifyObserver();
    }

    public double getGoogPrice() {
        return googPrice;
    }

    public void setGoogPrice(double newGoogPrice) {
        this.googPrice = newGoogPrice;
        notifyObserver();
    }

    private StockObserver observer;



    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
        System.out.println("Registering new observer");

    }

    @Override
    public void unregister(Observer deleteObserver) {

        System.out.println("Deleting observer with id"+observers.indexOf(deleteObserver)+1);
        observers.remove(observers.indexOf(deleteObserver));

    }

    @Override
    public  void notifyObserver() {

        for(Observer observer: observers) {
            observer.update(ibmPrice, aapPrice, googPrice);
        }

    }
}
