package threadProducerConsumer.cp;

// Java program to implement the
// producer consumer's problem

import java.lang.Thread;

// Producer class which extends the
// thread
class Producer extends Thread {

    // Creating a string buffer
    StringBuffer buffer;
    boolean dp = false;

    // Initializing the string buffer
    Producer()
    {
        buffer = new StringBuffer(4);
    }

    // Overriding the run method
    public void run()
    {
        synchronized (buffer)
        {

            // Adding the data into the
            // buffer
            for (int i = 0; i < 4; i++) {
                try {
                    buffer.append(i);
                    System.out.println("Produced " + i);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Notifying the buffer
            System.out.println("Buffer is FUll");
            buffer.notify();
        }
    }
}

// Consumer class which extends
// the thread
class Consumer extends Thread {

    // Creating the object of the
    // producer class
    Producer p;

    // Assigning the object of the
    // producer class
    Consumer(Producer temp)
    {
        p = temp;
    }

    // Overriding the run method
    public void run()
    {

        // Controlling the access of the
        // buffer to the shared producer
        synchronized (p.buffer)
        {
            try {
                p.buffer.wait();
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            // Printing the values of the string buffer
            // and consuming the buffer
            for (int i = 0; i < 4; i++) {
                System.out.print(p.buffer.charAt(i) + " ");
            }
            System.out.println("\nBuffer is Empty");
        }
    }
}

// ProducerConsumerTest class to implement the
// Producer Consumer problem
class GFG {
    public static void main(String args[])
    {
        // Initially, there needs to be some data
        // in order to consume the data. So,
        // Producer object is created first
        Producer p = new Producer();

        // Sending this producer object
        // into the consumer
        Consumer c = new Consumer(p);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        // Since from the producer object,
        // we have already produced the data.
        // So, we start by consuming it.
        t2.start();
        t1.start();
    }
}
