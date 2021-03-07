package designPatterns.creational.singleton.singleton_double_checked_locking;

public class ThreadSafeHandledByJVM {
    private static class Holder {
        static final ThreadSafeHandledByJVM INSTANCE = new ThreadSafeHandledByJVM();
    }

    public static ThreadSafeHandledByJVM getInstance() {
        return Holder.INSTANCE;
    }

    private ThreadSafeHandledByJVM() {
    }

}
