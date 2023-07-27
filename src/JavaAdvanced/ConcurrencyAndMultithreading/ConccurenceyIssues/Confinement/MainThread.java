package JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.Confinement;

import java.util.ArrayList;
import java.util.List;

public class MainThread {
    public static void main(String[] args) {
        
        var status = new DownloadStatus();

        List<Thread> threadList = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            // Let's see how we can use confinement to prevent race conditions. So instead of showing a single status object across multiple threads,
            // We're going to have each thread work with it's own status object.
            // Back to our demo class, so we start 10 threads, we wait for them to finish, at the end, we have to ask each thread for
            // it's status object. Then we'll combine the total bytes across all the status objects. But there's a problem here.
            // We're creating our download tasks over here. So later on, we won't have access to them.

            // Now, to solve this, we're going to create a list of download file task objects, and every time we create a new download
            // file task, we're going to add it to that list. So, Let's create a list of download file tasks, we call it tasks, and set
            // it to a new array list. Now, in our for loop, first we create a task object, new download file task, then we add it to our list.

            var task = new DownloadFileTask();
            tasks.add(task);
            var thread = new Thread(task);

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

        // With this we get a stream of integers. Now we can reduce this integer, so we call reduce, we can pass an initial value,
        // and then a binary operator. For example, a and b goes to a plus b. Or we can rewrite this as integer,
        // so we use a method reference here. With this we get the total bytes, so let's store it over here, and then print
        // it on a terminal. As simple as that. Take a look. So, we have 100, 000 bytes. If we run this program again, we get
        // the exact same result. So we no longer have a race condition. Because these threads are not modifying a shared object.

        var totalBytes = tasks.stream()
                .map(t -> t.getStatus().getTotalBytes())
                .reduce(Integer::sum);

        System.out.println(totalBytes);

    }
}
