package JavaAdvanced.ConcurrencyAndMultithreading;

public class JoiningThreads{
    public static void main(String[] args) {

        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        // Lets say we want to scan a downloaded file for viruses. Now Scanning a file is a time-consuming task.
        // It's not going to happen immediately like, incrementing an integer, it may take a few seconds so we should run it in a separate thread
        // but we should do that only after we have downloaded a file but here's the thing, how can we know if the download thread has finished downloading?
        // A file may take a couple of seconds to download or a few minutes or longer we cannot predict it so here we could use "thread.sleep" to
        // make the current thread sleep, but we dont know the exact time the file may finish downloading.

        // This is where we should use join threads. So after we start the download thread, we call "thread.join".
        // and this will make the current thread, that is the main thread that is executing this code, wait for the
        // completion of the download thread. So this call is going to block the current thread until the download thread.
        // has finished. Once this method returns, then we can print a message like file is ready
        // to be scanned. Now, just like this Sleep Method, the join method, throws and interrupted exception.
        // So we should handle it here.

        // So with the join method we tell the current thread to wait for the completion of another thread and that means while
        // this thread is waiting. It cannot do other things, for example, in the case of a desktop or a mobile app, this
        // main thread is responsible for handling UI events, like Mouse clicks and keystrokes. So if you make the main thread wait
        // for another thread. It cannot respond to these UI events while it's waiting. So that UI will freeze and the user will
        // not be able to resize or move the application window. But don't worry later, I will show you a better way to have one task
        // start after another task finishes without causing the current threat to wait. For now I just want you to understand
        // what joining is and how it works.

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File is ready to be scanned");

        }
}
