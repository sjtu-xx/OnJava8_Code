package _13_functional_programming;

import java.util.Locale;
import java.util.function.Function;

/**
 * @author xuexuan
 * @date 2022-07-13 23:09:07
 */
interface Funcss extends Function<String, String> {
}

public class ProduceFunction {
    static Funcss product() {
        return s -> s.toLowerCase(Locale.ROOT);
    }
}
