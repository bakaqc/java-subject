package fraction;

import math.MyMath;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

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

    @Override
    public String toString() {
        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }

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
        int gcd = MyMath.gcd(this.numerator, this.denominator);

        this.numerator /= gcd;
        this.denominator /= gcd;

        return this;
    }

    public static void main(String[] args) {
        Fraction fr1 = new Fraction(6, 18);

        Fraction fr2 = new Fraction(6, 18);

        Fraction fr3 = fr1.plus(fr2);
        System.out.println(fr3.numerator + "/" + fr3.denominator);
    }
}
