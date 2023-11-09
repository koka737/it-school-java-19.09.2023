package tema8.GeometricShape;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,12,13);
        Square square = new Square(5);
        System.out.println("the area of the triangle is: " + triangle.area());
        System.out.println("the perimeter of the triangle is: " + triangle.perimeter());
        System.out.println("the area of the square is: " + square.area());
        System.out.println("the perimeter of the square is: " + square.perimeter());
    }
}
