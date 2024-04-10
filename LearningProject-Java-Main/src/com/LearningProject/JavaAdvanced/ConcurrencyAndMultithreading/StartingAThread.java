package com.LearningProject.JavaAdvanced.ConcurrencyAndMultithreading;

public class StartingAThread {
    public static void main(String[] args) {

        // To create a thread in Java, we use the "Thread" class that is declared in the java.lang package. The constructor of this
        // class is overloaded, and the version that we use most often is the one that takes a runnable object.
        // This is any object that implements the runnable interface, this runnable interface represents a task to be run on a thread.
        // It's a very simple interface with a single method called run, so it has No parameters and returns void.

        // So let's say we want to download many files. Concurrently so the task that we're dealing with here is the task
        // of downloading a file. So let's add a new class to our project. I'm going to call this download file task

        System.out.println(Thread.currentThread().getName()); // Here we can get the current thread thats running
        // by typing the above code and printing it out. In this case the thread we will get is main thread as it
        // is running this main method. Each Thread has different name and ID so we can use either to check which thread is active
        // or working.

        // Let's create a new thread object. Here we should pass a new download file task. So this is how we
        // can create a new thread. Now we call "thread.start" to start this thread. Now, when
        // I run this program, the code for downloading a file will be executed in a separate thread

        //Thread thread = new Thread(someTaskYouWantToRun);      - example code
        //thread.start();                                        - example code

        // So we have two threats. One is the main threat that executed our main method and here's another thread that we explicitly
        // created for downloading a file. Each thread start executes a task and then dies so we don't have to explicitly
        // kill it.

        for (int i = 0; i < 10; i++) {

            // Now let's make this example more interesting, let's wrap this inside a for Loop to simulate downloading
            // 10 files concurrently. Even though these messages are appearing sequentially on the terminal, these
            // threads start and run in parallel. So this is how we can create and start a thread in Java.

            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }


    }
}
