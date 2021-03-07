package threadProducerConsumer.classic;

import static java.lang.Thread.sleep;

public class Producer  implements Runnable{
    private CubbyHole cubbyHole;
    private int number;
    public Producer(CubbyHole c, int number) {
        cubbyHole = c;
        this.number=number;

    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            cubbyHole.put(i);
            System.out.println("Producer #" + this.number+" put: "+i);
            try {
                sleep((int)Math.random()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
