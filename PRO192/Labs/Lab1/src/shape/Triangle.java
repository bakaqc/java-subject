package shape;

public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = (this.a + this.b + this.c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double circumFerence() {
        return this.a + this.b + this.c;
    }

    @Override
    public String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ")";
    }
}
