package _11_inner_class;

class WithInner {
    class Inner {
    }
}

public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi) {
        wi.super();
    }
}
