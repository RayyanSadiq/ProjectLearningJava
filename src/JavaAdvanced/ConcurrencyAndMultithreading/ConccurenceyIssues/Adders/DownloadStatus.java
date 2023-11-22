package JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.Adders;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {

    private boolean isDone;
    private int totalFiles;
    private LongAdder totalBytes = new LongAdder();

    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public void incrementTotalByte(){
        totalBytes.increment();
    }

    public void incrementTotalFiles(){
        totalFiles++;
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
