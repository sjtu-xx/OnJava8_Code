package p_05_parallel_coding;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xuexuan
 * @date 2022-08-27 20:03:50
 */
public class FutureTaskTest {
    static class CounterTask implements Callable<Integer> {
        private AtomicInteger a = new AtomicInteger();

        public CounterTask() {
            this.a.getAndIncrement();
        }

        @Override
        public Integer call() {
            System.out.println(Thread.currentThread().getName());
            new Nap(3);
            return 1;
        }
    }

    public static void main(String[] args) {
        FutureTask<Integer> integerFutureTask = new FutureTask<>(new CounterTask());
        integerFutureTask.run();
        System.out.println("xx");
        try {
            integerFutureTask.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
