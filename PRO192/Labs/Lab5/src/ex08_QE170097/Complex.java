package ex08_QE170097;

public class Complex extends Number {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public void add(Number n) {
        if (n instanceof Complex) {
            Complex complexNum = (Complex) n;

            this.real += complexNum.real;
            this.imaginary += complexNum.imaginary;
        } else {
            System.out.println("Cannot add a complex number with a non-complex number");
        }
    }

    @Override
    public void subtract(Number n) {
        if (n instanceof Complex) {
            Complex complexNum = (Complex) n;

            this.real -= complexNum.real;
            this.imaginary -= complexNum.imaginary;
        } else {
            System.out.println("Cannot subtract a complex number with a non-complex number");
        }
    }

    @Override
    public void multiply(Number n) {
        if (n instanceof Complex) {
            Complex complexNum = (Complex) n;

            this.real = this.real * complexNum.real - this.imaginary * complexNum.imaginary;
            this.imaginary = this.real * complexNum.imaginary + this.imaginary * complexNum.real;
        } else {
            System.out.println("Cannot multiply a complex number with a non-complex number");
        }
    }

    @Override
    public void divide(Number n) {
        if (n instanceof Complex) {
            Complex complexNum = (Complex) n;

            double denominator = Math.pow(complexNum.real, 2) + Math.pow(complexNum.imaginary, 2);

            this.real = (this.real * complexNum.real + this.imaginary * complexNum.imaginary) / denominator;
            this.imaginary = (this.imaginary * complexNum.real - this.real * complexNum.imaginary) / denominator;
        } else {
            System.out.println("Cannot divide a complex number with a non-complex number");
        }
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(5, 10);
        Complex c2 = new Complex(3, 7);
        c1.subtract(c2);
        System.out.println(c1);
    }
}
