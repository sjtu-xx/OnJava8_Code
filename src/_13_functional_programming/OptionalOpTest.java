package _13_functional_programming;

import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author xuexuan
 * @date 2022-07-13 23:41:24
 */
public class OptionalOpTest {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> true;
        Optional<String> ss = Optional.of("ss").filter(predicate);
        System.out.println(ss);

        Function<String, String> function = s -> s.toUpperCase(Locale.ROOT);
        Optional<String> s2 = Optional.of("ss").map(function);
        System.out.println(s2);

        Function<String, Optional<String>> function2 = s -> Optional.of(s.toUpperCase(Locale.ROOT));
        Optional<String> s3 = Optional.of("ss").flatMap(function2);
        System.out.println(s3);
    }
}
