package _06_init_and_clean;

import java.util.Arrays;
import java.util.Random;

/**
 * @author xuexuan
 * @date 2022-07-08 22:35:20
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        Integer[] a = new Integer[new Random().nextInt(20)];
        System.out.println(Arrays.toString(a)); // [null, null]
    }
}
