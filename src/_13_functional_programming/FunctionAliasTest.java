package _13_functional_programming;

import java.util.Locale;
import java.util.function.Function;

/**
 * @author xuexuan
 * @date 2022-07-13 23:12:18
 */

interface FunctionAlias<T,R> extends Function<T,R> {}

public class FunctionAliasTest {
    public static void main(String[] args) {
        FunctionAlias<String, String> function = a -> a.toLowerCase(Locale.ROOT);
        System.out.println(function.apply("ssS"));
    }
}
