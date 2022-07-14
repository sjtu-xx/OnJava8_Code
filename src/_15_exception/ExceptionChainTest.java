package _15_exception;

/**
 * @author xuexuan
 * @date 2022-07-14 23:09:48
 */
public class ExceptionChainTest {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e){
            throw new RuntimeException(e);
            // 等价于 exception.initCause(e)
        }
    }
}
