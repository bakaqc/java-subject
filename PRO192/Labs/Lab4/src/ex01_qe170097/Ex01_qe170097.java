package ex01_qe170097;

import java.util.Scanner;

public class Ex01_qe170097 {

    private static Scanner sc = new Scanner(System.in);

    private int value;

    public Ex01_qe170097() {
    }    

    public void input() {
        try {
            this.value = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
        }
    }

    private String convertToBinary() {
        int number = this.value;
//
//        String binary = "";
//
//        while (number > 0) {
//            int remainder = number % 2;
//            binary = remainder + binary;
//            number = number / 2;
//        }
//        return binary;
        return Integer.toBinaryString(value);
    }

    private String convertToEnglish() {
        String integer = Integer.toString(this.value);
        String english = "";

        for (int i = 0; i < integer.length(); i++) {
            switch (integer.charAt(i)) {
                case '1' -> {
                    english += "one";
                }

                case '2' -> {
                    english += "two";
                }

                case '3' -> {
                    english += "three";
                }

                case '4' -> {
                    english += "four";
                }

                case '5' -> {
                    english += "five";
                }

                case '6' -> {
                    english += "six";
                }

                case '7' -> {
                    english += "seven";
                }

                case '8' -> {
                    english += "eight";
                }

                case '9' -> {
                    english += "nine";
                }

                case '0' -> {
                    english += "zero";
                }
            }

            if (i < integer.length() - 1) {
                english += " ";
            }
        }

        return english;
    }

    public void output() {
        System.out.println(this.convertToBinary());
        System.out.println(this.convertToEnglish());
    }

    public static void main(String[] args) {
        Ex01_qe170097 i = new Ex01_qe170097();

        i.input();
        i.output();
    }
}
