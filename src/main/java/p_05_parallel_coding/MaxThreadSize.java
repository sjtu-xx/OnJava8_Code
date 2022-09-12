package p_05_parallel_coding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MaxThreadSize {
    static class Dummy extends Thread {
        @Override
        public void run() {
            new Nap(1);
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        int count = 0;
        try {
            while (true) {
                executorService.execute(new Dummy());
                count++;
            }
        } catch (Error e) {
            System.out.println(e.getClass().getSimpleName() + ":" + count);
            System.exit(0);
        } finally {
            executorService.shutdown();
        }
    }
}
