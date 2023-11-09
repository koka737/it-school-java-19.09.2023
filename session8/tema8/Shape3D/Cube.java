package tema8.Shape3D;

public class Cube extends Shape3D {
    public Cube(double side) {
        super(side, side);
    }

    @Override
    public void calculateSurfaceArea() {
        double surfaceArea = 6 * side * side;
        System.out.println("The surface area of the cube is: " + surfaceArea);
    }

    @Override
    public void calculateVolume() {
        double volume = side * side * side;
        System.out.println("The volume of the cube is: " + volume);
    }
}
