package p_05_parallel_coding;

import java.util.concurrent.CompletableFuture;

abstract class IntTestable implements Runnable {
    public abstract void evenIncrement();

    @Override
    public void run() {
        while (true) {
            evenIncrement();
        }
    }
}

class EvenIntTest extends IntTestable {
    private int i = 0;

    public int getInt() {
        return i;
    }

    @Override
    public void evenIncrement() {
        i++;
        i++;
    }
}

public class UnAtomicOp {

    public static void main(String[] args) {
        new TimeAbort(1);
        EvenIntTest it = new EvenIntTest();
        CompletableFuture.runAsync(it);
        while (true) {
            int anInt = it.getInt();
            if (anInt % 2 != 0) {
                System.out.println(anInt);
                System.exit(0);
            }
        }
    }
}
