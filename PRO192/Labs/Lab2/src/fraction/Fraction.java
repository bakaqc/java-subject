package fraction;

import java.util.Scanner;
import toan.Toan;

public class Fraction {

    int numerator;
    int denominator;

    //Hàm khởi tạo k đối số
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    //Hàm khởi tạo có đối số
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Hàm get, set
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //Cài đặt phương thức 
    public Fraction plus(Fraction other) {
        return (new Fraction(
                this.numerator * other.denominator + other.numerator * this.denominator,
                this.denominator * other.denominator
        ).reduce());
    }

    public Fraction minus(Fraction other) {
        return this.plus(new Fraction(-other.numerator, other.denominator));
    }

    public Fraction multiple(Fraction other) {
        return (new Fraction(
                this.numerator * other.numerator,
                this.denominator * other.denominator
        ).reduce());
    }

    public Fraction divide(Fraction other) {
        if (other.denominator == 0) {
            return null;
        }
        return this.multiple(new Fraction(other.denominator, other.numerator));
    }

    public Fraction reduce() {
        int gcd = Toan.mcf(this.numerator, this.denominator);

        this.numerator /= gcd;
        this.denominator /= gcd;
        return this;
    }

    //Hàm input
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        this.numerator = sc.nextInt();
        
        do{
            System.out.println("Enter denominator: ");
            this.denominator = sc.nextInt();
        }while(this.denominator == 0);
    }

    //Hàm toString
        @Override
    public String toString() {
        return "Fraction{" + "numerator=" + this.numerator + ", denominator=" + this.denominator + '}';
    }

    public static void main(String[] args) {
        Fraction fr1 = new Fraction();
        System.out.println("Enter Fraction 1:");
        fr1.input();
        
        Fraction fr2 = new Fraction();
        System.out.println("Enter Fraction 2:");
        fr2.input();
//
//        Fraction fr3 = fr1.plus(fr2);
//        System.out.println(fr3.numerator + "/" + fr3.denominator);
//
//        Fraction fr4 = fr1.multiple(fr2);
//        System.out.println(fr4.numerator + "/" + fr4.denominator);
    }
}
