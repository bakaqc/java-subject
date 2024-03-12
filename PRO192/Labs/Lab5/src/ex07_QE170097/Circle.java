package ex07_QE170097;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Perimeter() {
        return 2 * Shape.PI * this.radius;
    }

    @Override
    public double Area() {
        return Shape.PI * this.radius * this.radius;
    }

}
