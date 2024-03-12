package shape.model;

import java.util.Scanner;

public class Triangle implements Shape {

    // khai báo thuộc tính chung
    private double a;
    private double b;
    private double c;

    //Hàm khởi tạo k đối số
    public Triangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    //Hàm khởi tạo có đối số
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Hàm get, set
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // cài đặt phương thức 
//    public void tri() {
//        if (a <= 0 || b <= 0 || c <= 0) {
//            System.out.println("Đây không phải tam giác!");
//        } else if (a + b < c || a + c < b || b + c < a) {
//            System.out.println("Đây không phải tam giác!");
//        } else {
//            double p = (a + b + c) / 2;
//            System.out.println("Chu vi tam giác: " + 2 * p);
//            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//            System.out.println("Diện tích tam giác: " + s);
//        }
//    }

    @Override
    public double area() {
        double p = (this.a + this.b + this.c) / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    @Override
    public double circumference() {
        return this.a + this.b + this.c;
    }

//    //Hàm input
//    @Override
//    public void input() {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a: ");
//        this.a = s.nextDouble();
//
//        System.out.println("Enter b: ");
//        this.b = s.nextDouble();
//
//        System.out.println("Enter c: ");
//        this.c = s.nextDouble();
//    }

    //Hàm toString
    @Override
    public String toString() {
        return "Triangle{" + "a=" + this.a + ", b=" + this.b + ", c=" + this.c + '}';
    }

}
