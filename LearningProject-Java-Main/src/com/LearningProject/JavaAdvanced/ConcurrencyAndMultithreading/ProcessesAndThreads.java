package com.LearningProject.JavaAdvanced.ConcurrencyAndMultithreading;

public class ProcessesAndThreads {
    public static void main(String[] args) {

        // let's start this section with a quick overview of the key terms and ideas in concurrent systems. The one key term to
        // understand is what is a process. A process is an instance of a program or an application. When you launch an application, like
        // your code editor or music player, your operating system loads that application inside a process. So process contains
        // an image of the applications code. It has some memory and a bunch of other resources. Now, your operating system can
        // execute many processes at the same time For example, it can run an anti-virus while playing music so that's concurrency at the process level.
        // But we can also have concurrency within the process or with an application using threats. Technically speaking, a
        // thread is a sequence of instructions, that's why it's called a thread. It's like a thread of instructions.
        // Now practically speaking, a thread is actually that thing that executes your code. Each process has at least
        // one thread called the MAIN thread but we can create additional threat to run many tasks concurrently, for example, we
        // can build a web server that can serve many clients at the same time, we will serve each client using a separate
        // thread. Or we can build an application that downloads multiple images concurrently. We do this, by starting multiple threads
        // and have each thread. Download a separate image. This is what we call multi-threading applications. Applications that use
        // multiple threads are called multithreaded applications. Now, these days, most processors have multiple cores
        // and these cores can be used for running many processes or threads. If your application doesn't use threads, it's
        // essentially using only one of the processor cores. So it's not utilizing the full power of your CPU, so Your Hardware is wasted.

        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());

        // So this program is using two threads. One of them is the main thread that is running our main method.
        // The other is a background thread that runs the garbage collector this garbage collector removes unused objects from memory.
        // So our program is using two threads, but we have 16 threads available in total. Now this number may be different from machine to machine.
        // So to exploit parallel Hardware, you should learn about threads, you should learn How to start them, how to
        // pause them how to interrupt them, and more importantly, how to safely share data between them.
        // Because if two threads try to change some data at the same time, crazy things can happen. We'll talk about that later in this section.
        // But first, let's see how we can create and start a new thread, but look at that next.
    }
}
