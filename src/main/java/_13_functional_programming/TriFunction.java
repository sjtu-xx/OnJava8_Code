package _13_functional_programming;

/**
 * @author xuexuan
 * @date 2022-07-13 23:06:41
 */
@FunctionalInterface
public interface TriFunction<T, U, W, R> {
    R apply(T t, U u, W w);
}
