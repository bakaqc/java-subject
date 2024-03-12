package shape;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "(" + this.width + ", " + this.height + ")";
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public double circumFerence() {
        return (this.width + this.height) * 2;
    }
    
    public void aa() {
        System.out.println("Hello i am gay");
    }
}
