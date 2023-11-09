package tema8.Shape;

public class Circle implements Shape{
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void getArea(){
        System.out.println("the area of the circle is: " + 3.14 * radius * radius);
    }
}
