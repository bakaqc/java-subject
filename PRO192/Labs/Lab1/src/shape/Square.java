package shape;

public class Square implements Shape {
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }
    
    @Override
    public double area() {
        return this.edge * this.edge;
    }

    @Override
    public double circumFerence() {
        return this.edge * 4;
    }
}