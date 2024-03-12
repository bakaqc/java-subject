package shape;

import java.util.Scanner;

public class Circle implements Shape {

    //khai báo thuộc tính chung
    private double r;

    //Hàm khởi tạo k đối số
    public Circle() {
        this.r = 0;
    }

    //Hàm khởi tạo có đối số
    public Circle(double r) {
        this.r = r;
    }

    //Hàm get, set
    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r < 0) {
            this.r = 1.0;
        } else {
            this.r = r;
        }
    }

    //cài đặt phương thức
    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * r;
    }

    //Hàm input
    @Override
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius: ");
        this.r = s.nextDouble();
    }

    //Hàm toString
    @Override
    public String toString() {
        return "Circle{" + "r=" + this.r + '}';
    }
  
}
