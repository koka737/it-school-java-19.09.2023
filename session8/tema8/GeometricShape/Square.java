package tema8.GeometricShape;

public class Square extends GeometricShape {
    private int side;

    public Square(int side) {

        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
