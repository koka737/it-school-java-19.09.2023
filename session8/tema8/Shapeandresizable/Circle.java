package tema8.Shapeandresizable;

public class Circle implements Shape, Resizable {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        if (factor > 0) {
            radius *= factor;
        } else {
            System.out.println("Invalid resize factor. Factor must be greater than 0.");
        }
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
