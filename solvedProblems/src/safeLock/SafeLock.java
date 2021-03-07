package safeLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SafeLock {
    private Lock lock = new ReentrantLock();


    public void lock() throws InterruptedException {
        LockingManager.registerLock(this);
        long timeout = 1000;
        while (!lock.tryLock(timeout, TimeUnit.MILLISECONDS)) {
            if (LockingManager.checkForCircularDependency()) {
                throw new ThreadLockException();
            }
        }
    }
    public void unlock() {
        LockingManager.unregisterLock(this);
        lock.unlock();
    }
}