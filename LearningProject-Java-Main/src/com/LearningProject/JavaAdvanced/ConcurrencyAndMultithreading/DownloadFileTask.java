package com.LearningProject.JavaAdvanced.ConcurrencyAndMultithreading;

public class DownloadFileTask implements Runnable{

    @Override
    public void run() {

        // Let's just print a message like downloading a file. So let's not worry about the complexities of downloading, a file
        // We just want to focus on concurrency .

        System.out.println("Starting Download:" + Thread.currentThread().getName());

        // The thread class in Java has a sleep method, which we can use for pausing the execution of a threat with this.
        // We can simulate a long-running operation like downloading a file that takes a few seconds. So in our task class after
        // printing this message, let's call "thread.sleep". Here we can pass the delay in milliseconds. Let's say five thousand.
        // So this will suspend the current thread for roughly five thousand milliseconds or five seconds. It's not going to
        // be exactly five seconds because this is dependent on the underlying operating system, but we can assume that we'll
        // be sleeping for roughly five seconds, and during this time, other threads can get processor time.

        // Now, the Java compiler is complaining that we have an unhandled exception here. That is the interrupted exception. This is an exception that gets
        // thrown if you try to interrupt a thread that is sleeping. We'll talk about interrupting a thread later. But for now, let's handle this exception.


        // When you run this program. You will see that these 10 threads will start at the same time. And after 5 Seconds, they all
        // complete.

        // Now, if you had a single-threaded application downloading, this 10 files would take 50 seconds instead of five seconds because
        // each download will start once another download finished. So multithreading makes our applications faster and more responsive.
        // Now, what if we tried to download let's say 100 or 1,000 files concurrently? My machine has four cores and eight threads available.
        // So, how's that going to work? Well, the Java virtual machine has, what we call a thread scheduler, the job of the scheduler is to decide
        // what threads run for how long? So if you have more tasks than the available threads, the schedulers switches between the tasks giving
        // each task a slice of the CPU time. This happens so fast that gives us the illusion that these tasks are being executed in parallel, but that's
        // parallelism at software level.

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download Complete:" + Thread.currentThread().getName());
    }
}
