package p_05_parallel_coding;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xuexuan
 * @date 2022-08-27 19:26:18
 */
public class ParallelStreamTest {
    static class IntGenerator implements Supplier<Integer> {
        private AtomicInteger a = new AtomicInteger();

        @Override
        public Integer get() {
            return a.getAndAdd(1);
        }
    }

    private static void limitParallel() {
        List<Integer> resultList = Stream.generate(new IntGenerator())
                .limit(10)
                .parallel()
                .collect(Collectors.toList());
        System.out.println(resultList);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            limitParallel();
        }
    }
}
