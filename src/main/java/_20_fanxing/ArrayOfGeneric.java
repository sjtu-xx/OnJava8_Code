package _20_fanxing;

import java.util.Arrays;
import java.util.List;

public class ArrayOfGeneric {
    static final int SIZE = 10;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        gia = (Generic<Integer>[]) new Generic[SIZE];
        gia[0] = new Generic<Integer>();

        String a = "1";
        test(a);

    }

    private static <T> void test(T a) {
        List<String> c = Arrays.asList("1", "2", "3");
        T[] elementData;

        elementData = (T[]) new Object[SIZE];
        c.toArray(elementData);
    }
}
