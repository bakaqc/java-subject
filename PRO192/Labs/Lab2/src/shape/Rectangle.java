package shape;

import java.util.Scanner;

public class Rectangle implements Shape {

    // khai báo thuộc tính chung
    private double length;
    private double width;

    //Hàm khởi tạo k đối số
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }
    //Hàm khởi tạo có đối số
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    //Hàm get, set
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // cài đặt phương thức chung 
    @Override
    public double area() {
        double s = this.length * width;
        return s;
    }

    @Override
    public double circumference() {
        return (this.length + this.width) * 2;
    }

    //Hàm input
    @Override
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length: ");
        this.length = s.nextInt();

        System.out.println("Enter Width: ");
        this.width = s.nextInt();
    }
    
    //Hàm toString
    @Override
    public String toString() {
        return "Rectangle{" + "length=" + this.length + ", width=" + this.width + '}';
    }
}
