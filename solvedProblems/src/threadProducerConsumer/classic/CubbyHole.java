package threadProducerConsumer.classic;

public class CubbyHole {
    private int contents;
    private boolean availableForGet = false;


    public synchronized int get() {
        while (availableForGet == false) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            availableForGet = false;
            notifyAll();
            return contents;
        }



        public synchronized void put(int value) {
        while (availableForGet == true) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        contents = value;
        availableForGet = true;
        notifyAll();
        }
    }
