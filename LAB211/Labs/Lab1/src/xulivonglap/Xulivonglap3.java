/*
Bài 3: In kim tự tháp với ký tự *
    In ra kim tự tháp với chiều cao bằng 7
    In ra kim tự tháp ngược với chiều cao bằng 7
 */
package xulivonglap;

public class Xulivonglap3 {

//    In ra kim tự tháp với chiều cao bằng 7
    private static void pyramid() {
        int rows = 7;
        System.out.println("The pyramid with a height of 7:");
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

//    In ra kim tự tháp ngược với chiều cao bằng 7
    private static void invertedpyramid() {
        int rows = 7;
        System.out.println("The inverted pyramid with a height of 7:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid();
        invertedpyramid();
    }
}
