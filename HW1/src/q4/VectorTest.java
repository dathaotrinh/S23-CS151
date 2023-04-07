package q4;

public class VectorTest {
    public static void main(String[] args) {
        Vector v1 = new Vector(2.0, 5.0, -4.0);
        Vector v2 = new Vector(-2.0, -3.0, -5.0);

        // Print both vectors
        System.out.println("Print v1: " + v1);
        System.out.println("Print v2: " + v2);

        // Test all getters
        System.out.println("v1 getX(): " + v1.getX());
        System.out.println("v1 getY(): " + v1.getY());
        System.out.println("v1 getZ(): " + v1.getZ());

        // Test dotProduct()
        System.out.println("dotProduct(): " + v1.dotProduct(v2));

        // Test computeMagnitude()
        System.out.println("computeMagnitude(): " + v1.computeMagnitude());

        // Test normalizing vector
        v1.normalize();
        System.out.println("Print v1 after normalizing: " + v1);

        // Test scaling vector
        Vector scaledV1 = v1.scaleVector(3.0);
        System.out.println("Print v1 after scaling with factor of 3.0: " + scaledV1);

        // Test adding vector
        Vector addedV1 = v1.add(v2);
        System.out.println("Print v1 after adding v2: " + addedV1);
    }
}
