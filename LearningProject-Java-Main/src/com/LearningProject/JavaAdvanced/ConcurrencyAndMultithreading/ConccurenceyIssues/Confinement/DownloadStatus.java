package com.LearningProject.JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.Confinement;

public class DownloadStatus {

    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalByte(){

        totalBytes++;
    }

}
