package p_05_parallel_coding;

import java.util.concurrent.CompletableFuture;

public class TimeAbort {
    private boolean repeat = true;

    public TimeAbort(double time) {
        CompletableFuture.runAsync(() -> {
                    while (repeat) {
                        repeat = false;
                        new Nap(time);
                        System.exit(0);
                    }
                }
        );
    }
    public void setRepeat() {
        this.repeat = true;
    }
}
