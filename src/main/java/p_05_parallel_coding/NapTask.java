package p_05_parallel_coding;

import java.util.concurrent.FutureTask;

/**
 * @author xuexuan
 * @date 2022-08-27 19:38:31
 */
public class NapTask implements Runnable{
    private final int id;

    public NapTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        new Nap(0.1);
        System.out.println(this + " " + Thread.currentThread().getName());
    }

    @Override
    public String toString() {
        return "NapTask - " + id;
    }
}
