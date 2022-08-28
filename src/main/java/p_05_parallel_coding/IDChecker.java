package p_05_parallel_coding;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IDChecker {
    public static final int SIZE = 100_000;

    static class MakeObjects implements Supplier<List<Integer>> {
        private Supplier<HasID> gen;

        public MakeObjects(Supplier<HasID> gen) {
            this.gen = gen;
        }

        @Override
        public List<Integer> get() {
            return Stream.generate(gen).limit(SIZE).map(HasID::getID).collect(Collectors.toList());
        }
    }

    public static void test(Supplier<HasID> gen) {
        CompletableFuture<List<Integer>> groupA = CompletableFuture.supplyAsync(new MakeObjects(gen));
        CompletableFuture<List<Integer>> groupB = CompletableFuture.supplyAsync(new MakeObjects(gen));
        groupA.thenAcceptBoth(groupB, (a, b) -> {
            HashSet<Integer> sa = new HashSet<>(a);
            boolean b1 = sa.retainAll(new HashSet<>(b));
            System.out.println(sa.size());
        });
    }
}
