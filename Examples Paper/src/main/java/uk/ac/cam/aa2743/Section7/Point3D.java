package uk.ac.cam.aa2743.Section7;

public class Point3D implements Comparable<Point3D> {
    private final double x;
    private final double y;
    private final double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public int compareTo(Point3D other) {
        if (Double.compare(this.z, other.z) != 0) {
            return Double.compare(this.z, other.z);
        } else if (Double.compare(this.y, other.y) != 0) {
            return Double.compare(this.y, other.y);
        } else {
            return Double.compare(this.x, other.x);
        }
    }
}

