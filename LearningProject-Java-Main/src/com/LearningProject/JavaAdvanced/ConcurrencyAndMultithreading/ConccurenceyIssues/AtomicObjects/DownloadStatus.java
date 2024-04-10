package com.LearningProject.JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.AtomicObjects;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {

    private boolean isDone;
    private int totalFiles;
    private AtomicInteger totalBytes = new AtomicInteger();

    public int getTotalBytes() {
        return totalBytes.get();
    }

    public void incrementTotalByte(){
        totalBytes.incrementAndGet();
    }

    public void incrementTotalFiles(){
        totalFiles++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done( ) {
        isDone = true;
    }
}
