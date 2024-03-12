package ex02_qe170097;

import java.util.Scanner;

public class Ex02_qe170097 {

    private static Scanner sc = new Scanner(System.in);
    private double[] arr;

    public Ex02_qe170097() {
    }

    private boolean isValidString() {
        String inputString = sc.nextLine();

        try {
            String[] nums = inputString.trim().split(" \\s+");

            this.arr = new double[nums.length];
            int i = 0;

            for (String num : nums) {
                this.arr[i++] = Double.parseDouble(num);
            }

            System.out.println("valid string");

            return true;
        } catch (NumberFormatException e) {
            System.out.println("invalid string");
            System.out.println("N/A");

            return false;
        }
    }

    private double squareSum() {
        double sum = 0.0;

        for (int i = 0; i < this.arr.length; i++) {
            sum += this.arr[i] * this.arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Ex02_qe170097 s = new Ex02_qe170097();

        if (s.isValidString()) {
            System.out.println("square sum: " + s.squareSum());
        }
    }
    

}
