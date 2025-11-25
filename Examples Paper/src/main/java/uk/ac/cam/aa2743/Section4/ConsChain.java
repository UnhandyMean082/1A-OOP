package uk.ac.cam.aa2743.Section4;

public class ConsChain {
    public static void create() {
        System.out.println("Instantiating classes:");
        C c = new C();
    }
}

class A {
    public A() {
        System.out.println("A instantiated.");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B instantiated.");
    }
}

class C extends B {
    public C() {
        super();
        System.out.println("C instantiated.");
    }
}