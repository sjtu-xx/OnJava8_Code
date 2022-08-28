package p_05_parallel_coding.dead_lock;

import p_05_parallel_coding.Nap;

public class Philosophy implements Runnable {
    private final int seat;
    private final StickHolder left;
    private final StickHolder right;

    public Philosophy(int seat, StickHolder left, StickHolder right) {
        this.seat = seat;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "P" + seat;
    }

    @Override
    public void run() {
        while (true) {
            left.pickUp();
            right.pickUp();
            System.out.println(this + "eating");
            left.putDown();
            right.putDown();
        }
    }

}
