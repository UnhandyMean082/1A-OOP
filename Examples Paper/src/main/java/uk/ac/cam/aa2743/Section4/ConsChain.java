package uk.ac.cam.aa2743.Section4;

public class ConsChain {
    public static void create() {
        System.out.println("Instantiating classes:");
        C c = new C(10);
        System.out.println("Classes instantiated.\nA's data from C: " + c.data);
    }
}

class A {
    int data;

    public A(int data) {
        System.out.println("A instantiated.");
        this.data = data;
    }
}

class B extends A {
    public B(int data) {
        super(data);
        System.out.println("B instantiated.");
    }
}

class C extends B {
    public C(int data) {
        super(data);
        System.out.println("C instantiated.");
    }
}