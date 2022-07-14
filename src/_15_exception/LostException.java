package _15_exception;

/**
 * @author xuexuan
 * @date 2022-07-14 23:22:14
 */
public class LostException {
    public static void f() {
        throw new RuntimeException("ff");
    }
    public static void d() {
        throw new RuntimeException("dd");
    }


    public static void main(String[] args) {
        try {
            try {
                f();
            } finally {
                d();
            }
        } catch (RuntimeException e){
            System.out.println(e); // dd
        }
    }
}
