package _09_polymorphism;

/**
 * @author xuexuan
 * @date 2022-07-07 23:12:19
 */
class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println(sup.field); // 0
        System.out.println(sup.getField()); // 1
    }
}
