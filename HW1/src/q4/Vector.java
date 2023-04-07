package q4;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double xcoord, double ycoord, double zcoord) {
        this.x = xcoord;
        this.y = ycoord;
        this.z = zcoord;
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

    public Vector add(Vector v) {
        this.x += v.getX();
        this.y += v.getY();
        this.z += v.getZ();
        return this;
    }

    public double dotProduct(Vector v) {
        double result = this.x * v.getX() + this.y * v.getY() + this.z * v.getZ();
        return result;
    }

    public double computeMagnitude() {
        double result = Math.sqrt(Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0) + Math.pow(this.z, 2.0));
        return result;
    }

    public void normalize() {
        double magnitude = computeMagnitude();
        this.x /= magnitude;
        this.y /= magnitude;
        this.z /= magnitude;
    }

    public Vector scaleVector(double factor) {
        this.x *= factor;
        this.y *= factor;
        this.z *= factor;
        return this;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
