package p_05_parallel_coding;

import java.util.concurrent.TimeUnit;

/**
 * @author xuexuan
 * @date 2022-08-27 19:35:43
 */
public class Nap {

    public Nap(double sleepSeconds) {
        try {
            TimeUnit.MILLISECONDS.sleep((long) (1000 * sleepSeconds));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Nap(double sleepSeconds, String msg) {
        this(sleepSeconds);
        System.out.println(msg);
    }
}
