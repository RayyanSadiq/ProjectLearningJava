package com.Droid7X.JavaAdvanced.ConcurrencyAndMultithreading.InterruptingThreads;

public class DownloadFileTask implements Runnable{

    @Override
    public void run() {

        System.out.println("Downloading A file :" + Thread.currentThread().getName());

        // First, lets go back to our download file task instead of pausing this thread, to simulate a long
        // running task, let's add a for loop that continuously prints a message on the terminal.

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            // So, back to our download file task class, let's Here we should continuously check for an interrupt request. If we get that request
            // then we'll have to stop the download. So in this for loop, let's add a code block. First we check for an interrupt request.
            //So we type if thread. currentThread, we get access to the current thread, and then call is interrupted. If this returns true,
            // then we can break out of this loop or simply return. Otherwise, we're going to download the byte. So remember, the interrupt method doesn't
            // force a thread to stop what it's doing, it simply sends an interrupt request.

            if (Thread.currentThread().isInterrupted()){
                return;
            };

            // To support interruption we should constantly check for the interrupted request and act accordingly. Now if a thread is
            // sleeping and we send an interrupt request to it, it throws an exception. That is why we have to handle this interrupted
            // exception when pausing a thread.

            System.out.println("Download byte "+ i);
        }

    }
}
