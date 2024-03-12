package students_jdbc;

import java.util.*;

public class Menu {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String option[] = {"Print student list",
            "Add new student",
            "Edit information student",
            "Search by ID",
            "Remove student",
            "Quit"};
        int choice = 0;
        do {
            System.out.println("\nStudent managing Program");
            choice = FormMenu.getChoice(option);
            switch (choice) {
                case 1:
                    StudentManagement.printAllStudent();
                    break;
                case 2:
                    StudentManagement.addStudent();
                    break;
                case 3:
                    StudentManagement.editInforStudent();
                    break;
                case 4:
                    StudentManagement.searchByID();
                    break;
                case 5:
                    StudentManagement.remove();
                    break;

                default:
                    System.out.println("Thank you and GoodBye!");
            }
        } while (choice > 0 && choice < 6);
    }
}
