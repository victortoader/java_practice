package threadProducerConsumer.classic;

public class Consumer implements Runnable {


    private CubbyHole cubbyHole;
    private int number;

    public Consumer(CubbyHole c, int number) {
        cubbyHole = c;
        this.number = number;

    }

    @Override
    public void run() {
        int value;
        for (int i=0; i<10; i++) {
            value = cubbyHole.get();
            System.out.println("Consumer # "+ this.number+ " got: " +value);
        }
    }
}
