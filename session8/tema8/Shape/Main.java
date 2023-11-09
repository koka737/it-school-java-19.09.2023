package tema8.Shape;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10,5,7);
        rectangle.getArea();
        circle.getArea();
        triangle.getArea();

    }
}
