package tema8.Shape;

public class Rectangle implements Shape{
    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void getArea(){
        System.out.println("the area of the rectangle is: " + length * width);
    }
}
