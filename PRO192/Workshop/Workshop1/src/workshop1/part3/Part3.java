package workshop1.part3;

import java.util.Scanner;

public class Part3 {

    public static void main(String[] args) {
        String[] list = new String[2];
        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter list of students: ");
            list[i] = sc.nextLine();
        }
        System.out.println("\n");
        for (int i = 0; i < 2; i++) {
            list[i] = list[i].toUpperCase();
            System.out.println(list[i]);
        }
    }
}
