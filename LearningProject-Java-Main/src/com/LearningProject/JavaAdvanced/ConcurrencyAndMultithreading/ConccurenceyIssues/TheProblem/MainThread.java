package com.LearningProject.JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.TheProblem;

import java.util.ArrayList;
import java.util.List;

public class MainThread {
    public static void main(String[] args) {

        // Let's say as part of downloading multiple files, we want to show the total number of bytes we have downloaded so far. So we need to store the total
        // value somewhere and have multiple threads incremented as they are downloading files. This is going to cause a race condition, which means multiple
        // threads racing, or competing to modify a shared resource. So first we will make a DownloadStatus object
        
        var status = new DownloadStatus();

        // Now we want all our download threads to report to a single download status object. So, in our demo class Let's create a download status object, new download
        // status. Now we'll start 10 download threads.

        List<Thread> threadList = new ArrayList<>();

        // So we have to wait for all the threads to finish. We cannot call "thread.join" , because this will make the main thread wait for each download to finish
        // before starting another download. Because this join method is a block method. So in the first iteration, we create a thread, we start it, and then we wait
        // for that thread to finish before going to the second iteration to create a second thread, which we don't want, we would have to join them after starting
        // all threads.



        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threadList.add(thread);
        }

        // Okay so to use the join method here, we should start all these threads simultaneously, and then join with all of them. So to do this let's declare a list of threads,
        // a list of thread, we call it threads, and set it to a new array list. Every time we start a thread, we add it to our list. So threads add thread. Now here
        // we need another for loop to iterate over all these threads and join with them.

        for (var thread : threadList){

            // So for thread in threads, we simply call thread. join. Now once again we should handle the interrupted exception, so let's do it real quick. So, with this for
            // loop, we can wait for all these download threads to finish. Then, we can print the total number of bytes we have downloaded.
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // We are starting 10 download threads and sharing a single status object across these threads. Once all these threads are complete, we should print
        // the total number of bytes we have downloaded.

        System.out.println(status.getTotalBytes());
        // We should get 100,000 bytes, However you will realize we will get a lower number instead. This is a race condition in action.
        // Because multiple threads are racing or competing to update the total number of bytes.

        // Now let me explain what happens under the hood. So back to our download status class, look at this increment operator here :

        //  totalBytes++;

        // This operation involves 3 steps. So even though we have only 1 line of code,
        // there will be 3 steps happening under the hood.

        // First, the value of this field has to be read from the main memory and stored in the CPU. Next the CPU is going to increment this value, and then the
        // updated value is going to be stored in the memory. So we have 3 steps, and we call this a non atomic operation. Because it involves multiple steps.
        // In contrast, an atomic operation is like an atom.

        // We cannot break it down into many steps. Now imagine 2 threads trying to call into this method at the same time. Let's say the value of this field is 0.
        // Both these threads will read this value concurrently, they both increment it and write it to the memory. So the result will be 1 instead of 2.
        // This is how we lose an update.

    }
}
