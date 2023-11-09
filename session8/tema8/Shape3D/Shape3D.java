package tema8.Shape3D;

public abstract class Shape3D {
    protected double radius;
    protected double side;

    public Shape3D(double radius, double side) {
        this.radius = radius;
        this.side = side;
    }

    public abstract void calculateVolume();
    public abstract void calculateSurfaceArea();

    // Getter methods for radius and side
    public double getRadius() {
        return radius;
    }

    public double getSide() {
        return side;
    }
}
