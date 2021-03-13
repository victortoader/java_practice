package designPatterns.creational.singleton.singleton_double_checked_locking;

public class ThreadSafeManuallyMade {
    private ThreadSafeManuallyMade() {
    }


    /*  volatile tells to JVM to not reorder the instructions
    1. construct empty instance 2. assign to rs 3. call constructor
    AND that processors should flush any updates to these variables right away  */
    private static volatile ThreadSafeManuallyMade rs = null;

    public static ThreadSafeManuallyMade getExpensiveResource() {
        if (rs == null) {
            synchronized (ThreadSafeManuallyMade.class) {
                if (rs == null) {
                    rs = new ThreadSafeManuallyMade();
                }
            }
        }
        return rs;
    }
}

