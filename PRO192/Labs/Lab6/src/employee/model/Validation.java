package employee.model;

import java.util.Scanner;

public class Validation {

    public static int checkIntputIntLinmit(int min, int max) {
        int result = - 1;
        while (true) {
            Scanner s = new Scanner(System.in);
            result = Integer.parseInt(s.nextLine());
            if (result < min || result > max) {
                System.out.println("Please input number in rage [" + min + "," + max + "]");
                System.out.println("Enter again ");
            } else {
                break;
            }
        }
        return result;
    }
}
