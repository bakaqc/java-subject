package rectangle;

import java.util.Scanner;

public class Rectangle {

    // khai báo thuộc tính chung
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

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
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length: ");
        this.length = s.nextInt();
        
        System.out.println("Enter Width: ");
        this.width = s.nextInt();
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
    

    // cài đặt phương thức chung 
    double area() {
        double s = this.length * width;
        return s;
    }

    double circumference() {
        return (this.length + this.width) * 2;
    }

    public static void main(String[] args) {
        // tạo đối tượng và gọi hàm khởi tạo mặc định
        Rectangle chuong = new Rectangle();
        System.out.println(chuong.length);
        System.out.println(chuong.width);
        chuong.length = 100;
        chuong.width = 3;
        System.out.println("Area: " + chuong.area());
        System.out.println("Circumference: " + chuong.circumference());

        // tạo đối tượng và gọi hàm khởi tạo có 2 đối số
        Rectangle vuong = new Rectangle(2, 5);
        System.out.println("Area: " + vuong.area());
        System.out.println("Circumference: " + vuong.circumference());
    }
}
