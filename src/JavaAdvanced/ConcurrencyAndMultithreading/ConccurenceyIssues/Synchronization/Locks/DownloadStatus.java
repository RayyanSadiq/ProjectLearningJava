package JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.Synchronization.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {

    // Another strategy for preventing race conditions and visibility problems is to prevent multiple threads from accessing an object at the same time.
    // This is called synchronization. So we have to synchronize or coordinate multiple threads trying to access an object.
    // We do that using locks. So we put a lock on a block of our code, and the java virtual machine will ensure that only
    // one thread at a time can execute that block of code which is called the critical section.

    // In reality, our code is going to get executed sequentially, so we lose concurrency. As a metaphor, think of a hotel room.
    // Only one guest at a time can be in that room. When a guest goes in, they lock the door so others cannot enter.
    // They have to wait until that guest checks out. Using locks in code is pretty much the same.

    // You have the same concept in databases as well. I talked about this in my ultimate SQL course. We have the same code
    // as before, we are sharing a single status object across many download tasks. If you run this program, we have a race
    // condition because every time we see a different value. So multiple threads are racing to update, the total bytes fill.


    private int totalBytes;

    // Now, let's see how we can use a lock to solve this problem. So back to our download status class, we want to ensure
    // that only one thread at a time can increment this field. So here we declare a private field of type lock This is
    // an interface declared in the java. util. concurrent package. So lock, we call it lock, and set it to a new reentrant lock.
    // This is one of the implementations of the lock interface.
    private Lock lock = new ReentrantLock();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalByte(){
        // In our increment method, before we increment this field we call the lock method to lock this lock object.
        // I know it sounds weird. We increment the total bytes filled, and finally we call lock. unlock lock. So when a thread enters this method, it will lock its lock object.
        lock.lock();

        // It's like a guest going to a hotel room and locking the door. Other guests or other threads have to wait for this guest to come out.
        // This is how locking works. Now as a best practice, we should execute this line in a finally block, because if an exception is thrown,
        // we don't want to keep this lock locked forever. Otherwise, no other threads can execute this code. And this may cause a deadlock and our application will crash.
        // If whats in the try block causes an exception, with the final block, we'll ensure that we always unlock this lock. Now in this particular case we don't really need the try finally block because
        // incrementing this field is not going to throw an exception.
        // But in your applications, you might have more complex logic and somewhere along this logic you might get an exception.
        // So make sure to unlock this lock inside a finally block. Let's run our program and see the result. So we get 100, 000, let's run
        // it one more time, there you go. So this is how we can use locks to prevent concurrency problems.

        try {
            totalBytes++;
        }
        finally {
            lock.unlock();
        }

        // But in your applications, you might have more complex logic and somewhere along this logic you might get an exception.
        // So make sure to unlock this lock inside a finally block. Let's run our program and see the result. So we get 100, 000, let's run
        // it one more time, there you go. So this is how we can use locks to prevent concurrency problems.





    }

}
