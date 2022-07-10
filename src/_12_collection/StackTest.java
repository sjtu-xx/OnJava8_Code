package _12_collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author xuexuan
 * @date 2022-07-10 21:02:13
 */
public class StackTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("123");
        String pop = stack.pop();

    }
}
