package _04_operator;

/**
 * @author xuexuan
 * @date 2022-07-07 23:26:56
 */
public class URShift {
    public static void main(String[] args) {
        byte b = -1;
        System.out.println(Integer.toBinaryString(b)); // 11111111111111111111111111111111
        b >>>= 10;
        System.out.println(Integer.toBinaryString(b)); // 11111111111111111111111111111111
        b = -1;
        System.out.println(Integer.toBinaryString(b)); // 11111111111111111111111111111111
        System.out.println(Integer.toBinaryString(b >>> 10)); // 1111111111111111111111
    }
}
