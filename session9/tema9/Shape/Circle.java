package tema9.Shape;

public class Circle extends Shape{
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {

        System.out.println("the area of the circle is: " + 3.14 * radius * radius);
    }

    @Override
    public void getPerimeter() {

        System.out.println("the perimeter of the circle is: " + 2 * 3.14 * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }


}
