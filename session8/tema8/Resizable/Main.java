package tema8.Resizable;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,5);
        rectangle.display();
        // Resize the rectangle
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(25);
        rectangle.display();
    }
}
