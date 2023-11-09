package tema8.Movable;

public class Car implements Movable, Drawable{
    @Override
    public void draw() {
        System.out.println("the car is drawable");
    }

    @Override
    public void move() {
        System.out.println("the car is moving");

    }
}
