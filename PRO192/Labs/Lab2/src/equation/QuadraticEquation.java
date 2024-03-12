package equation;

import java.util.Scanner;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    //Hàm khởi tạo k đối số
    public QuadraticEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    //Hàm khởi tạo có đối số
    public QuadraticEquation(double a, double b, double c) {
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

    //Cài đặt phương thức
    public void quadratic() {
        double del = b * b - 4 * a * c;
        if (del < 0) {
            System.out.println("Vo nghiem");
        }
        if (del == 0) {
            double t = -b / 2 / a;
            if (t < 0) {
                System.out.println("Vo nghhiem");
            } else {
                double x1 = Math.sqrt(t);
                double x2 = Math.sqrt(t);
                System.out.println("Nghiem x1 = " + x1);
                System.out.println("Nghiem x2 = " + x2);
            }
        }
        if (del > 0) {
            double t1 = (-b + Math.sqrt(del)) / 2 / a;
            double t2 = (-b - Math.sqrt(del)) / 2 / a;
            if (t1 < 0 && t2 < 0) {
                System.out.println("Vo nghiem");
            }
            if (t1 < 0 && t2 >= 0) {
                double x3 = Math.sqrt(t2);
                double x4 = -Math.sqrt(t2);
                System.out.println("Nghiem x3 = " + x3);
                System.out.println("Nghiem x4 = " + x4);
            }
            if (t1 >= 0 && t2 < 0) {
                double x1 = Math.sqrt(t1);
                double x2 = -Math.sqrt(t1);
                System.out.println("Nghiem x1 = " + x1);
                System.out.println("Nghiem x2 = " + x2);
            }
            if (t1 >= 0 && t2 >= 0) {
                double x1 = Math.sqrt(t1);
                double x2 = -Math.sqrt(t1);
                System.out.println("Nghiem x1 = " + x1);
                System.out.println("Nghiem x2 = " + x2);
                double x3 = Math.sqrt(t2);
                double x4 = -Math.sqrt(t2);
                System.out.println("Nghiem x3 = " + x3);
                System.out.println("Nghiem x4 = " + x4);
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
        return "QuadraticEquation{" + "a=" + this.a + ", b=" + this.b + ", c=" + this.c + '}';
    }

    public static void main(String[] args) {
        QuadraticEquation a = new QuadraticEquation();
        a.quadratic();

        QuadraticEquation b = new QuadraticEquation(1, 1, 0);
        b.quadratic();
    }
}
