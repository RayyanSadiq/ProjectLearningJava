package com.Droid7X.JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.TheProblem;

public class DownloadFileTask implements Runnable{


    private final DownloadStatus status;

    public DownloadFileTask (DownloadStatus status){
        this.status = status;
    }

    @Override
    public void run() {

        System.out.println("Downloading A file :" + Thread.currentThread().getName());

        // Now let's change the run method a little bit. Instead of integer.max value, let's use 10,000. So we want to simulate a scenario
        // where each file is 10, 000 bytes. We can also add an underline here, this makes our code cleaner and more readable.

        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()){
                return;
            };
            //So in each iteration, we call status dot increment total bytes. Now we don't need this message anymore. So, let's simplify our code. Now back to our demo
            // class.
            status.incrementTotalByte();

            System.out.println("Download byte "+ i);
        }
    }
}










