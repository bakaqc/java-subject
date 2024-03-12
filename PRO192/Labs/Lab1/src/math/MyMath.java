package math;

public class MyMath {

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        if (a * b == 0) {
            return a + b;
        }
        
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        
        return a;
    }
}
