package com.LearningProject.JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.WaitAndNotify;

public class DownloadFileTask implements Runnable{


    private final DownloadStatus status;

    public DownloadFileTask (DownloadStatus status){
        this.status = status;
    }

    @Override
    public void run() {

        System.out.println("Downloading A file :" + Thread.currentThread().getName());


        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted()){
                return;
            };

            status.incrementTotalByte();

            //System.out.println("Download byte "+ i);
        }
        status.done();
        synchronized (status){
            status.notifyAll();
        }

    }
}










