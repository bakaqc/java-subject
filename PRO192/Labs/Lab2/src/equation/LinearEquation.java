package equation;

import java.util.Scanner;

public class LinearEquation {

    //khai báo thuộc tính chung
    private double b;
    private double c;

    //Hàm khởi tạo k đối số
    public LinearEquation() {
        this.b = 0;
        this.c = 0;
    }

    //Hàm khởi tạo có đối số
    public LinearEquation(double b, double c) {
        this.b = b;
        this.c = c;
    }

    //Hàm get,set
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
    public void solve() {
        if (b == 0 && c == 0) {
            System.out.println("Phương trình có vô số nghiệm");
        } else {
            if (b == 0 && c != 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có nghiệm: " + (-c) / b);
            }
        }
    }

    //Hàm input
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter b: ");
        this.b = s.nextDouble();

        System.out.println("Enter c: ");
        this.c = s.nextDouble();
    }

    //Hàm toString
    @Override
    public String toString() {
        return "LinearEquation{" + "b=" + b + ", c=" + c + '}';
    }

    public static void main(String[] args) {
        // tạo các đối tượng riêng
        LinearEquation e1 = new LinearEquation();
        e1.solve();

        LinearEquation e2 = new LinearEquation(0, 0);
        e2.solve();

    }
}
