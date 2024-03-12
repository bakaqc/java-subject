package Ex02_QE170097;

import java.util.Scanner;

public class StringNumerals_QE170097 {

    private static Scanner sc = new Scanner(System.in);

    public StringNumerals_QE170097() {
    }

    private static boolean isValidString(String str) {
        try {
            String[] nums = str.trim().split("\\s+");

            for (String num : nums) {
                Double.parseDouble(num);
            }

            System.out.println("valid string");

            return true;
        } catch (NumberFormatException e) {
            System.out.println("invalid string");
            System.out.println("N/A");

            return false;
        }
    }

    private static double squareSum(String str) {
        double result = 0.0;

        String[] nums = str.trim().split("\\s+");

        for (String num : nums) {
            result += Math.pow(Double.parseDouble(num), 2);
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "123    4    4.5   7   9   9.3";
        
        if (isValidString(str)) {
            System.out.println(squareSum(str));
        }
    }
}
