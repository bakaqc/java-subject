package Ex01_QE170097;

import java.util.Scanner;

public class IntegerNumber_QE170097 {

    private static Scanner sc = new Scanner(System.in);

    public IntegerNumber_QE170097() {
    }

    private static String convertToBinary(int value) {
        String binary = "";

        while (value > 0) {
            int remainder = value % 2;
            binary = remainder + binary;
            value = value / 2;
        }

        return binary;
    }

    private static String convertToEnglish(int value) {
        String english = "";

        String[] datas = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        while (value > 0) {
            english = datas[value % 10] + " " + english;
            value = value / 10;
        }

        return english.trim();
    }

    public static void main(String[] args) {
        System.out.println(convertToEnglish(345));
    }
}
