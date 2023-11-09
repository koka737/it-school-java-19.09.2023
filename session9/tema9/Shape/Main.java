package tema9.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 12);

        // Set color and filled for the circle
        circle.setColour("blue");
        circle.setFilled(true);

        circle.getArea();
        circle.getPerimeter();

        // Get and print the color of the circle
        System.out.println("Circle color: " + circle.getColour());

        // Get and print the filled status of the circle
        System.out.println("Is circle filled: " + circle.isFilled());

        rectangle.setColour("pink");
        rectangle.setFilled(false);

        rectangle.getArea();
        rectangle.getPerimeter();


        System.out.println("Rectangle color: " + rectangle.getColour());


        System.out.println("Is rectangle filled: " + rectangle.isFilled());


    }
}
