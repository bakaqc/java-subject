package ex07_QE170097;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }   
    
    @Override
    public double Perimeter() {
       return 2*(this.width*this.length); 
    }

    @Override
    public double Area() {
        return this.length*this.width;
    }
    
}
