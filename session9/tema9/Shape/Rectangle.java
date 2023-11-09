package tema9.Shape;

public class Rectangle extends Shape {
    private int length;
    private int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }

    @Override
    public void getPerimeter() {
        int perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
