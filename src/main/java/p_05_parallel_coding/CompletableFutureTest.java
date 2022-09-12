package p_05_parallel_coding;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest {
    static class Task implements Runnable {

        @Override
        public void run() {
            new Nap(1);
            System.out.println(Thread.currentThread().getName() + " finish");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CompletableFuture.runAsync(new Task(), executorService);
        CompletableFuture.runAsync(new Task(), executorService);
        CompletableFuture.runAsync(new Task(), executorService);
        executorService.shutdown();
    }
}
