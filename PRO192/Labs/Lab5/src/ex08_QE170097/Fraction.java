package ex08_QE170097;

public class Fraction extends Number{
    
    private int numerator;
    private int denominator;

    public Fraction() {
        super();
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public void add(Number n) {
        if (n instanceof Fraction) {
            Fraction f = (Fraction) n;

            numerator = numerator * f.denominator + denominator * f.numerator;
            denominator *= f.denominator;
        } else {
            System.out.println("Cannot add a fraction with a non-fraction number");
        }
    }

    @Override
    public void subtract(Number n) {
        if (n instanceof Fraction) {
            Fraction f = (Fraction) n;

            numerator = numerator * f.denominator - denominator * f.numerator;
            denominator *= f.denominator;
        } else {
            System.out.println("Cannot subtract a fraction with a non-fraction number");
        }
    }

    @Override
    public void multiply(Number n) {
        if (n instanceof Fraction) {
            Fraction f = (Fraction) n;

            numerator *= f.numerator;
            denominator *= f.denominator;
        } else {
            System.out.println("Cannot multiply a fraction with a non-fraction number");
        }
    }

    @Override
    public void divide(Number n) {
         if (n instanceof Fraction) {
            Fraction f = (Fraction) n;

            numerator *= f.denominator;
            denominator *= f.numerator;
        } else {
            System.out.println("Cannot divide a fraction with a non-fraction number");
        }
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
    
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5, 2);
        Fraction f2 = new Fraction(1, 4);       
        f1.add(f2);
        System.out.println(f1);
    }
    
    
    
    
}
