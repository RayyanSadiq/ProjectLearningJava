package JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.WaitAndNotify;

public class DownloadStatus {

    private volatile boolean isDone;
    private int totalFiles;
    private int totalBytes;
    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalByte(){
        synchronized (totalBytesLock){
            totalBytes++;
        }
    }

    public void incrementTotalFiles(){
        synchronized (totalFilesLock){
            totalFiles++;
        };
    }

    public synchronized void BADIncrementTotalFiles1(){ // This code does the acts the exact same way as BADIncrementTotalFiles2()
        totalFiles++;
    }

    public synchronized void BADIncrementTotalFiles2(){
        synchronized (this){ // SYNCHRONIZING ON "THIS" IS BAD PRACTICE
            totalFiles++;
        }

    }
    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done( ) {
        isDone = true;
    }
}
