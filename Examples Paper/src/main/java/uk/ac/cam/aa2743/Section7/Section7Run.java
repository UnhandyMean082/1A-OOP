package uk.ac.cam.aa2743.Section7;

public class Section7Run {
    public static void run() {
        System.out.println("--- Running Section 7 Code ---\n");

        Point3D less = new Point3D(1, 2, 4);
        Point3D more = new Point3D(2, 3, 4);
        System.out.println("Less is " + less.compareTo(more) + " than more.\n");
    }
}
