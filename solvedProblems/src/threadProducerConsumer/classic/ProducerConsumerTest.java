package threadProducerConsumer.classic;

public class ProducerConsumerTest {

    public static void main(String[] args) {
        CubbyHole c = new CubbyHole();
        Thread p1 =  new Thread(new Producer(c, 1));
        Thread c1 = new Thread(new Consumer(c, 1));
        p1.start();
        c1.start();

    }
}
