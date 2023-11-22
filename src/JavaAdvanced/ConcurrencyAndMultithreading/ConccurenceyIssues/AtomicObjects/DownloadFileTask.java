package JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.AtomicObjects;

public class DownloadFileTask implements Runnable{


    private final DownloadStatus status;

    public DownloadFileTask (DownloadStatus status){
        this.status = status;
    }

    @Override
    public void run() {

        System.out.println("Downloading A file :" + Thread.currentThread().getName());


        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()){
                return;
            };

            status.incrementTotalByte();
            //System.out.println("Download byte "+ i);
        }
    }
}










