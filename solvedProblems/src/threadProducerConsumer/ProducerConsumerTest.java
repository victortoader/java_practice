package threadProducerConsumer;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class ProducerConsumerTest {


    public static void main(String[] args) {


        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}




class Producer implements Runnable {

    protected List<Integer> queue = new LinkedList<>();
    protected boolean availableForGet = false;


    @Override
    public void run() {

        synchronized (queue) {
            int maxSize = (int) 1000;
            while(availableForGet == true) {
                try {
                    queue.wait();
                } catch (Exception e) {
                }
            }
            for (int i=0; i<maxSize; i++) {
                Integer a = new Random().nextInt();
                queue.add(a);

                System.out.println("Producing " +a);


//                if (queue.size()>2)
//                    queue.notifyAll();
            }
            availableForGet = true;
            queue.notifyAll();
        }

    }
}

class Consumer implements Runnable {

    private Producer producer;


    public Consumer (Producer producer) {
        this.producer = producer;
    }


    @Override
    public void run() {

        synchronized (producer.queue) {
            while(producer.availableForGet==false) {
                try {
                    producer.queue.wait();
                } catch (Exception e) {
                }
            }
            while(producer.queue.size()>0){
                Integer num=producer.queue.remove(0);
                processElement(num);
            }
            producer.availableForGet=false;
            producer.queue.notifyAll();

        }

    }

    public static void processElement(Integer num) {
        System.out.println("Consuming  "+ num);
    }
}
