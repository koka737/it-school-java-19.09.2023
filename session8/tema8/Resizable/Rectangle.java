package tema8.Resizable;

public class Rectangle implements Resizable{
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int newWidth) {
        if (newWidth > 0) {
            width = newWidth;
            System.out.println("Resized width to: " + width);
        } else {
            System.out.println("Invalid width value");
        }
    }

    @Override
    public void resizeHeight(int newHeight) {
        if (newHeight > 0) {
            height = newHeight;
            System.out.println("Resized height to: " + height);
        } else {
            System.out.println("Invalid height value");
        }
    }
    public void display() {
        System.out.println("Rectangle: Width = " + width + ", Height = " + height);
    }
}
