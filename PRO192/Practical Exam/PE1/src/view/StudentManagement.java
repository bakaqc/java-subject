package view;

import inputter.Inputter;
import java.util.ArrayList;
import java.util.Scanner;
import model.Student;
import model.StudentList;

public class StudentManagement extends Menu<String>{

    //Khai bao doi tuong Library
    private StudentList sm;
    
    private static String[] options = {
        "List all students",
        "Search student",
        "Add new student",
        "Exit"
    };

    public StudentManagement(String td, String[] mc, StudentList sm) {
        super(td, mc);
        this.sm = sm;
    }

    private void menuSearch() {
        String[] selection = {
            "Search by StudentID",
            "Search by LastName",
            "Search by DOB",
            "Search by Gender",
            "Exit"
        };
        Menu<String> menu = new Menu<String>("Student Searching", selection) {
            @Override
            public void execute(int n) {
                Scanner s = new Scanner(System.in);
                switch (n) {
                    case 1:
                        String sid = null;
                        sid = Inputter.inputPattern("Enter Student ID (st. ID S0000): ", "[sS][\\d]{4}");
                        
                       
                        break;
                    case 2:
                        System.out.println("Enter LastName: ");
                        
                        break;
                    case 3:
                        System.out.println("Enter Date Of Birth: ");
                       
                        
                        
                        break;
                    case 4:
                        System.out.println("Enter Gender: ");
                        
                        break;
                    default:
                        System.out.println("Thanks!");
                        break;
                }
            }
        };
        menu.run();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                this.sm.listStudent();
                break;
            case 2:
                menuSearch();
                break;
            case 3:
                this.sm.addNewStudent();
                break;
            default:
                System.out.println("Thank you and Goodbye!");
                break;

        }
    }

    public static void main(String[] args) {
        StudentManagement a = new StudentManagement("Student Management", options, new StudentList());
        a.run();
    }
}


