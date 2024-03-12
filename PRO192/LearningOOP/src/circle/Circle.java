package circle;

import java.util.Scanner;

public class Circle {

    //khai báo thuộc tính chung
    private double r;

    public Circle() {
        this.r = 0;
    }

    public Circle(double r) {
        this.r = r;
    }

    //cài đặt phương thức
    double area() {
        return Math.PI * r * r;
    }

    double circumfernce() {
        return 2 * Math.PI * r;
    }

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

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius: ");
        this.r = s.nextDouble();
    }

    @Override
    public String toString() {
        return "Circle{" + "r=" + r + '}';
    }

    public static void main(String[] args) {
        //tạo các đối tượng riêng
        Circle hi = new Circle();
        System.out.println(hi.r);
        System.out.println("Area: " + hi.area());
        System.out.println("Circumference: " + hi.circumfernce());

        Circle dak = new Circle(3);
        System.out.println(dak.r);
        System.out.println("Area: " + dak.area());
        System.out.println("Circumference: " + dak.circumfernce());
    }
}
