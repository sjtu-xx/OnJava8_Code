package p_05_parallel_coding.dead_lock;

import p_05_parallel_coding.Nap;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class DiningPhilosophy {
    private StickHolder[] stickHolders;
    private Philosophy[] philosophies;

    public DiningPhilosophy(int n) {
        stickHolders = new StickHolder[n];
        Arrays.setAll(stickHolders, i -> new StickHolder());
        philosophies = new Philosophy[n];
        Arrays.setAll(philosophies, i -> new Philosophy(i, stickHolders[i], stickHolders[(i + 1) % n]));
        Arrays.stream(philosophies).forEach(CompletableFuture::runAsync);
    }

    public static void main(String[] args) {
        new DiningPhilosophy(3);
        new Nap(10, "shutdown");
    }
}
