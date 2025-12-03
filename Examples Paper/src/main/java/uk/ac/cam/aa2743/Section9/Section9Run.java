package uk.ac.cam.aa2743.Section9;

public class Section9Run {
    public static void run() {
        System.out.println("--- Running Section 9 Code ---\n");

        final double EPSILON = 1e-9;
        final int MAX_ITER = 100;
        try {
            double S = 25.0;
            double expected = 5.0;
            double actual = NewtonRaphsonSqrt.sqrt(S, EPSILON, MAX_ITER);
            boolean success1 = Math.abs(actual - expected) < EPSILON;
            System.out.println("Test 1 (Positive S=" + S + "): " + (success1 ? "PASS" : "FAIL"));
            if (!success1) {
                System.out.println("  Expected: " + expected + ", Actual: " + actual);
            }
        } catch (Exception e) {
            System.out.println("Test 1 (Positive S): FAIL (Unexpected Exception: " + e.getMessage() + ")");
        }
        try {
            double S = 0.0;
            double actual = NewtonRaphsonSqrt.sqrt(S, EPSILON, MAX_ITER);
            boolean success2 = actual == 0.0;
            System.out.println("Test 2 (S=" + S + "): " + (success2 ? "PASS" : "FAIL"));
        } catch (Exception e) {
            System.out.println("Test 2 (S=0.0): FAIL (Unexpected Exception)");
        }
        try {
            double S = 1.0;
            double actual = NewtonRaphsonSqrt.sqrt(S, EPSILON, MAX_ITER);
            boolean success3 = actual == 1.0;
            System.out.println("Test 3 (S=" + S + "): " + (success3 ? "PASS" : "FAIL"));
        } catch (Exception e) {
            System.out.println("Test 3 (S=1.0): FAIL (Unexpected Exception)");
        }
        try {
            double S = -4.0;
            NewtonRaphsonSqrt.sqrt(S, EPSILON, MAX_ITER);
            System.out.println("Test 4 (Negative S): FAIL (Expected Exception was NOT thrown)");
        } catch (Exception e) {
            boolean success4 = e.getMessage().contains("negative number");
            System.out.println("Test 4 (Negative S): " + (success4 ? "PASS" : "FAIL (Wrong message)"));
        }
        System.out.println("\n");
    }
}
