package JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.Confinement;

public class DownloadFileTask implements Runnable{


    private final DownloadStatus status;

    public DownloadFileTask (){
        this.status = new DownloadStatus();
    }

    @Override
    public void run() {

        System.out.println("Downloading A file :" + Thread.currentThread().getName());

        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()){
                return;
            };

            status.incrementTotalByte();

            System.out.println("Download byte "+ i);
        }
    }

    //So here's our getter, get status, which returns the status field. As a best practice, move these getters and setters
    // down the bottom, this makes our code cleaner and easier to read. So first we list our fields, then we have our
    // constructors, then we have our public methods, and finally we have our getters and setters.
    public DownloadStatus getStatus() {
        return status;
    }
}










