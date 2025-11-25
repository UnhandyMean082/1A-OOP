package uk.ac.cam.aa2743.Section4;

public class DefaultAccess {
    public static void get() {
        accessed example = new accessed();
        System.out.println("Data: " + example.data);
    }
}

class accessed {
    int data = 10;
}