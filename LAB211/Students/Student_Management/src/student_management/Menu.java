package student_management;

import java.util.*;

public class Menu {

    private StudentManagement sm;

    public Menu() {
        sm = new StudentManagement();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String option[] = {"Print student list", "Add new student", "Edit information student",
            "Sort student list", "Find a student", "Remove a student", "Quit"};
        int choice = 0;
        StudentManagement list = new StudentManagement();
        do {
            System.out.println("\nStudent managing Program");
            choice = FormMenu.getChoice(option);
            switch (choice) {
                case 1:
                    list.printAllStudent();
                    break;
                case 2:
                    list.addStudent();
                    break;
                case 3:
                    list.editInforStudent();
                    break;
                case 4:
                    list.sort();
                    break;
                case 5:
                    list.search();
                    break;
                case 6:
                    list.removeStudent();
                    break;
                default:
                    System.out.println("Thank you and GoodBye!");
            }
        } while (choice > 0 && choice < 7);
    }
}
