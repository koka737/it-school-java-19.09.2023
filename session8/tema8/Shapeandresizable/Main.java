package tema8.Shapeandresizable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("The area of the circle is: " + circle.area());
        System.out.println("The perimeter of the circle is: " + circle.perimeter());

        // To resize the circle, you can call the resize method and then display the new radius
        circle.resize(5);
        System.out.println("The new size of the circle is: " + circle.radius);
    }
}
