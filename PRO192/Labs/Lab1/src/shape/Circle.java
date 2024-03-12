package shape;

public class Circle implements Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double circumFerence() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "(" + radius + ")";
    }
}
