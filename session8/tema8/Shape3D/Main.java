package tema8.Shape3D;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(10.0);
        Cube cube = new Cube(20.9); // Provide the side length as a single argument
        sphere.calculateSurfaceArea();
        sphere.calculateVolume();
        cube.calculateSurfaceArea();
        cube.calculateVolume();
    }
}
