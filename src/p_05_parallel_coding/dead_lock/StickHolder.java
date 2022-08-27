package p_05_parallel_coding.dead_lock;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class StickHolder {
    private static class Chopstick {
    }

    private Chopstick chopstick = new Chopstick();
    private BlockingQueue<Chopstick> holder = new ArrayBlockingQueue<>(1);

    public StickHolder() {
       putDown();
    }

    public void pickUp() {
        try {
            holder.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void putDown() {
        try {
            holder.put(chopstick);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
