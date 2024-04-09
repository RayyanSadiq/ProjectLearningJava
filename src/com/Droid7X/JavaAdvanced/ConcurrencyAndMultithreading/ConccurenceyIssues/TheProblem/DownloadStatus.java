package com.Droid7X.JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.TheProblem;

public class DownloadStatus {

    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalByte(){
        //We also need a method for incrementing this field. So instead of adding a setter, I would prefer to add an increment method so each thread can call
        // this to increment our field. It prevents us from accidentally resetting the total bytes in a thread. Public void increment total bytes, and here we
        // type totalBytes++.
        totalBytes++;

        // Now let me explain what happens under the hood. So back to our download status class, look at this increment operator here. This operation involves 3 steps. So even though we have only 1 line of code,
        // there will be 3 steps happening under the hood.

        //First, the value of this field has to be read from the main memory and stored in the CPU. Next the CPU is going to increment this value, and then the
        // updated value is going to be stored in the memory. So we have 3 steps, and we call this a non atomic operation. Because it involves multiple steps.
        // In contrast, an atomic operation is like an atom.

        //We cannot break it down into many steps. Now imagine 2 threads trying to call into this method at the same time. Let's say the value of this field is 0.
        // Both these threads will read this value concurrently, they both increment it and write it to the memory. So the result will be 1 instead of 2. This is how we lose an update.
    }

}
