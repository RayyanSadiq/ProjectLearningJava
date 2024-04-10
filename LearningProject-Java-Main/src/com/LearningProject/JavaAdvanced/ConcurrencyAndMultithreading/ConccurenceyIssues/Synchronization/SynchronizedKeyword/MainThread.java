package com.LearningProject.JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.Synchronization.SynchronizedKeyword;

import java.util.ArrayList;
import java.util.List;

public class MainThread {
    public static void main(String[] args) {

        var status = new DownloadStatus();

        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threadList.add(thread);
        }

        for (var thread : threadList){

            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(status.getTotalBytes());


    }
}
