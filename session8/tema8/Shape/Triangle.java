package tema8.Shape;

public class Triangle implements Shape {
    public int side1;
    public int side2;
    public int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void getArea() {
        double s = (side1 + side2 + side3) / 2.0; // Make sure to use double for accurate calculations
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the triangle is: " + area);
    }
}
