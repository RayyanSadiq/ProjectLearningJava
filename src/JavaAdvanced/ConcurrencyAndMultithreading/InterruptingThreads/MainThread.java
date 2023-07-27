package JavaAdvanced.ConcurrencyAndMultithreading.InterruptingThreads;

public class MainThread {
    public static void main(String[] args) {

        // Quite often when dealing with long live tasks, we want to give our users the ability to cancel. So here we are starting a download task,
        // I want to cancel this after one second.

        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            thread.sleep(1000);  // lets suppose a user click stop after 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // One note here is that our download thread didn't stop is that calling the interrupt method doesn't actually force the thread
        // to stop. It simply sends an interrupt request to the thread. It's up to that thread to decide if it should stop what it's doing.


        thread.interrupt();


    }
}
