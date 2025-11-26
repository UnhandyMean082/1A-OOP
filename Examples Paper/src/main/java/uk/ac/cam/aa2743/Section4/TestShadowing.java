package uk.ac.cam.aa2743.Section4;

public class TestShadowing {
    public static void test() {
        Super a = new Sub();
        System.out.println("a.value = " + a.value);
        a.printValue();
    }
}

class Super {
    public String value = "Super";
    public void printValue() {
        System.out.println("Super.printValue: " + value);
    }
}

class Sub extends Super {
    public String value = "Sub";
    @Override
    public void printValue() {
        System.out.println("Sub.printValue: " + value);
    }
}
