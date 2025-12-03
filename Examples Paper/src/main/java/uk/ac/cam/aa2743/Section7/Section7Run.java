package uk.ac.cam.aa2743.Section7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Section7Run {
    public static void run() {
        System.out.println("--- Running Section 7 Code ---\n");

        Point3D p1 = new Point3D(1.0, 2.0, 3.0);
        boolean accessorTest = p1.getX() == 1.0 && p1.getY() == 2.0 && p1.getZ() == 3.0;
        System.out.println("Accessor Test (1.0, 2.0, 3.0): " + (accessorTest ? "PASS" : "FAIL"));
        Point3D pa = new Point3D(5.0, 10.0, 20.0);
        Point3D pb = new Point3D(15.0, 10.0, 10.0);
        Point3D pc = new Point3D(5.0, 10.0, 10.0);
        Point3D pd = new Point3D(15.0, 5.0, 10.0);
        boolean zTest = pa.compareTo(pb) > 0;
        System.out.println("compareTo Z-Axis Test (20 vs 10): " + (zTest ? "PASS" : "FAIL"));
        boolean yTest = pb.compareTo(pd) > 0;
        System.out.println("compareTo Y-Axis Test (10 vs 5): " + (yTest ? "PASS" : "FAIL"));
        boolean xTest = pb.compareTo(pc) > 0;
        System.out.println("compareTo X-Axis Test (15 vs 5): " + (xTest ? "PASS" : "FAIL"));
        List<Point3D> points = new ArrayList<>();
        points.add(pa);
        points.add(pb);
        points.add(pc);
        points.add(pd);
        Collections.sort(points);
        boolean sortTest = points.get(0).equals(pd) &&
                points.get(1).equals(pc) &&
                points.get(2).equals(pb) &&
                points.get(3).equals(pa);
        System.out.println("Collections.sort Test: " + (sortTest ? "PASS" : "FAIL") + "\n");

        StudentData sd = new StudentData();
        sd.addStudent("Alice", 75.0);
        sd.addStudent("Bob", 80.0);
        sd.addStudent("Charlie", 60.0);
        sd.addStudent("David", 90.0);
        sd.addStudent("Eve", 85.0);
        List<String> names = sd.getStudents();
        boolean namesSorted = names.equals(Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve"));
        System.out.println("getStudents() test (Sorted Names): " + (namesSorted ? "PASS" : "FAIL"));
        double expectedMedian = 80.0;
        double actualMedian = sd.getMedianMark();
        boolean medianTest = actualMedian == expectedMedian;
        System.out.println("getMedianMark() test (Odd Size): " + (medianTest ? "PASS" : "FAIL"));
        sd.addStudent("Frank", 50.0);
        expectedMedian = 77.5;
        actualMedian = sd.getMedianMark();
        boolean evenMedianTest = actualMedian == expectedMedian;
        System.out.println("getMedianMark() test (Even Size): " + (evenMedianTest ? "PASS" : "FAIL"));
        List<String> topStudents = sd.getTopP(40.0);
        List<String> expectedTop = Arrays.asList("David", "Eve", "Bob");
        boolean topPTest = topStudents.equals(expectedTop);
        System.out.println("getTopP() test (40%): " + (topPTest ? "PASS" : "FAIL") + "\n");

        Pair p1_ = new Pair(10, 5);
        boolean accessorTest1 = p1_.c1 == 10 && p1_.c2 == 5;
        System.out.println("Pair Accessor Test: " + (accessorTest1 ? "PASS" : "FAIL"));
        Pair p2 = new Pair(20, 100);
        boolean primarySortTest = p1_.compareTo(p2) < 0; // 10 < 20
        System.out.println("Pair Primary Sort Test (10 vs 20): " + (primarySortTest ? "PASS" : "FAIL"));
        Pair p3 = new Pair(10, 20);
        boolean secondarySortTest = p1_.compareTo(p3) < 0; // 5 < 20 when c1 is equal
        System.out.println("Pair Secondary Sort Test (5 vs 20): " + (secondarySortTest ? "PASS" : "FAIL"));
        boolean stringTest = p1_.getString().equals("10, 5");
        System.out.println("Pair getString() Test: " + (stringTest ? "PASS" : "FAIL"));
        List<Pair> sortList = new ArrayList<>();
        sortList.add(p2);
        sortList.add(p1_);
        sortList.add(p3);
        Collections.sort(sortList);
        boolean sortIntegrationTest = sortList.get(0).c1 == 10 && sortList.get(0).c2 == 5 &&
                sortList.get(1).c1 == 10 && sortList.get(1).c2 == 20 &&
                sortList.get(2).c1 == 20 && sortList.get(2).c2 == 100;
        System.out.println("Collections Sort Integration Test: " + (sortIntegrationTest ? "PASS" : "FAIL"));
    }
}
