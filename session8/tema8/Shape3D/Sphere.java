package tema8.Shape3D;

public class Sphere extends Shape3D {
    public Sphere(double radius) {
        super(radius, 0); // Call the superclass constructor with the radius and a default value for side
    }

    @Override
    public void calculateSurfaceArea() {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("The surface area of the sphere is: " + surfaceArea);
    }

    @Override
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of the sphere is: " + volume);
    }
}
