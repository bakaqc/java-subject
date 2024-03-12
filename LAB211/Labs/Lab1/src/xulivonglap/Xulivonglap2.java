/*
Bài 2: Chương trình hiển thị chuỗi Fibonacci:
    Hiển thị ra 7 số Fibonacci với vòng lặp for
    Hiển thị ra 7 số Fibonacci với vòng lặp while
 */
package xulivonglap;

public class Xulivonglap2 {

//     Hiển thị ra 7 số Fibonacci với vòng lặp for
    private static void fibonacciWithFor() {
        int n = 7, t1 = 0, t2 = 1;
        System.out.print("First " + n + " numbers with For loop:\n");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + "  ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

//    Hiển thị ra 7 số Fibonacci với vòng lặp while
    private static void fibonacciWithWhile() {
        int n = 7, t1 = 0, t2 = 1;
        System.out.print("\nFirst " + n + " numbers with While loop:\n");
        while (n > 0) {
            System.out.print(t1 + "  ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            n--;
        }
    }

    public static void main(String[] args) {
        fibonacciWithFor();
        fibonacciWithWhile();
        System.out.println();
    }
}
