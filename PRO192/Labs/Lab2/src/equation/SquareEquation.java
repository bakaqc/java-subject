package equation;

import java.util.Scanner;

public class SquareEquation {

    //khai báo thuộc tính chung
    private double a;
    private double b;
    private double c;

    //Hàm khởi tạo k đối số
    public SquareEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    //Hàm khởi tạo có đối số
    public SquareEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Hàm get,set
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
    public void solve() {
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Phương trình có vô số nghiệm");
        } else if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có một nghiệm: " + (-c / b));
            }
        } else {
            double delta = (float) (b * b - 4 * a * c);
            double x1;
            double x2;
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phương trình có 2 nghiệm là: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: "
                        + "x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
    }

    //Hàm input
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a: ");
        this.a = s.nextDouble();

        System.out.println("Enter b: ");
        this.b = s.nextDouble();

        System.out.println("Enter c: ");
        this.c = s.nextDouble();
    }

    //Hàm toString
    @Override
    public String toString() {
        return "SquareEquation{" + "a=" + this.a + ", b=" + this.b + ", c=" + this.c + '}';
    }

    public static void main(String[] args) {
        // tạo các đối tượng riêng
        SquareEquation s1 = new SquareEquation();
        s1.solve();
        System.out.println();
        SquareEquation s2 = new SquareEquation(1, 5, 6);
        s2.solve();

    }
}
