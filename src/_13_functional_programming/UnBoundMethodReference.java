package _13_functional_programming;

/**
 * @author xuexuan
 * @date 2022-07-13 22:40:53
 */
class X {
    String f() {
        return "X:f()";
    }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}

public class UnBoundMethodReference {
    public static void main(String[] args) {
        TransformX sp = X::f;
        X x = new X();
        System.out.println(sp.transform(x));
    }
}

