package com.LearningProject.JavaAdvanced.ExecutiveFramework;

import java.util.concurrent.CompletableFuture;

public class exampleService {
    public  void  send(){
        LongTask.simulate();
        System.out.println("Mail was sent");
    }

    public CompletableFuture<Void> sendAsync() {
        return CompletableFuture.runAsync(() -> send());
    }
}
