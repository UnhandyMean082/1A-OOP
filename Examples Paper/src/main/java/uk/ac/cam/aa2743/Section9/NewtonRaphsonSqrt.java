package uk.ac.cam.aa2743.Section9;

public class NewtonRaphsonSqrt {

    public static double sqrt(double S, double epsilon, int maxIterations) throws Exception {
        if (S < 0) {
            throw new Exception("Cannot calculate the square root of a negative number: " + S);
        }
        if (S == 0.0 || S == 1.0) {
            return S;
        }

        double x = S / 2.0;

        for (int i = 0; i < maxIterations; i++) {
            assert x > 0 : "Newton-Raphson guess became non-positive during iteration: " + x;
            double nextX = 0.5 * (x + S / x);
            if (Math.abs(nextX - x) < epsilon) {
                return nextX;
            }
            x = nextX;
        }
        return x;
    }
}
