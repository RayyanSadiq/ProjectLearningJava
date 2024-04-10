package com.LearningProject.JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.VolatileKeyword;

public class MainThread {
    public static void main(String[] args) {


        var status = new DownloadStatus();

        var thread1 =  new Thread(new DownloadFileTask(status));
        var thread2 =  new Thread(() -> {
            while (!status.isDone()){}
            System.out.println(status.getTotalBytes() + " bytes downloaded");
        });

        thread1.start();
        thread2.start();


    }
}
