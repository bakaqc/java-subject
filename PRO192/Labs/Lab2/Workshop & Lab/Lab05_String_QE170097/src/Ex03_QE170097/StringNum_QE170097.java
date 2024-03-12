package Ex03_QE170097;

import java.util.Scanner;

public class StringNum_QE170097 {

    private static Scanner sc = new Scanner(System.in);

    public static void compute(String str) {
        int intSum = 0;
        float floatSum = 0.f;
        String stringSum = "";

        String[] items = str.trim().split("\\s+");

        for (String item : items) {
            try {
                float num = Float.parseFloat(item);

                if (!item.contains(".")) {
                    intSum += (int) num;
                } else {
                    floatSum += num;
                }
            } catch (NumberFormatException e) {
                stringSum += " " + item;
            }
        }

        System.out.println("the sum of integer numbers: " + intSum);
        System.out.println("the sum of float numbers: " + floatSum);
        System.out.println("the sum of strings: " + stringSum.trim());
    }

    public static void main(String[] args) {
        compute("1.4   3  abc   2   4.5   9bc   8   2.6   9   10   2.0   4.3   2a3");
    }
}
