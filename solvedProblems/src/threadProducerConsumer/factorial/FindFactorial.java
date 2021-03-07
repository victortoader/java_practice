package threadProducerConsumer.factorial;



  // Java program to find the factorial
// of a number by the implementation
// of threads using thread class

    class ThreadImpl extends Thread {
        static int fact = 1;

        // Overriding the run method
        // to find the factorial of
        // a number 5
        public void run()
        {

            // Loop to compute the factorial
            for (int i = 1; i <= 30; i++)
                fact = fact * i;
            System.out.println(fact);
        }
    }

// Class to create a thread and
// compute the factorial
    public class FindFactorial {
        public static void main(String[] args)
        {
            // Creating an object of the
            // thread class
            Thread t1 = new Thread(new ThreadImpl());

            // Computing the above class
            t1.start();
        }


}
