package Multithreading;

public class Synchronization {

    private int sum=0;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void calculate() {
        setSum(getSum()+1);
    }
}


