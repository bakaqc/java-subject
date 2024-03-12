package shape.model;

import java.util.Scanner;

public class Square implements Shape {

    // khai báo thuộc tính chung
    private double a;

    //Hàm khởi tạo k đối số
    public Square() {
        this.a = 0;
    }
    //Hàm khởi tạo có đối số
    public Square(double a) {
        this.a = a;
    }

    //Hàm get, set
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    // cài đặt phương thức chung 
    @Override
    public double area() {
        return this.a * this.a;
    }

    @Override
    public double circumference() {
        return 4 * this.a;
    }

//    
//    //Hàm input
//    @Override
//    public void input() {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter edge: ");
//        this.a = s.nextInt();
//    }
    
    //Hàm toString
    @Override
    public String toString() {
        return "Square{" + "a=" + this.a + '}';
    }

}
