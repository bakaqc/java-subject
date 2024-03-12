package workshop1.part2;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        float num1, num2;
        String op;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number one: ");
        num1 = sc.nextInt();

        System.out.println("Enter number two: ");
        num2 = sc.nextInt();

        System.out.println("Enter operation: ");
        sc = new Scanner(System.in);
        op = sc.nextLine();

        if (op.equals("+")) {
            System.out.println("The result of " + num1 + op + num2 + "=" + (num1 + num2));
        }
        if (op.equals("-")) {
            System.out.println("The result of " + num1 + op + num2 + "=" + (num1 - num2));
        }
        if (op.equals("*")) {
            System.out.println("The result of " + num1 + op + num2 + "=" + (num1 * num2));
        }
        if (op.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error!");
            } else {
                System.out.println("The result of " + num1 + op + num2 + "=" + (num1 / num2));
            }
        }
    }
}
