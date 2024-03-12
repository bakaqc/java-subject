package model;

import inputter.Inputter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList extends ArrayList<Student> {

    //Ham khoi tao
    public StudentList() {
        super();
        this.loadData();
    }

    //List all Student
    public void listStudent() {
        this.listStudent(this);
    }

    //List any Student
    public void listStudent(ArrayList<Student> List) {
        if (this.isEmpty()) {
            System.out.println("Empty list! ");
            return;
        } else {
            System.out.println("Book list: ");
            for (int i = 0; i < this.size(); i++) {
                System.out.println(this.get(i));
            }
            System.out.println("Total: " + List.size() + " .");
        }
    }

//    Ham load data
    private void loadData() {
        File f = new File("student.txt");
        try ( Scanner s = new Scanner(f)) {

            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] row = line.split(":");

                try {
                    String[] name = row[1].split(" ");
                    this.add(new Student(row[0], name[0], name[1], row[2], row[3]));

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Ham search by ID
    public ArrayList<Student> searchByStudentID(String StudentID) {
        ArrayList<Student> List = new ArrayList<>();
        StudentID = StudentID.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getStudentID().contains(StudentID)) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;

    }

    //Ham search by DOB
    public ArrayList<Student> searchByDOB(String DateOfBirth) {
        ArrayList<Student> List = new ArrayList<>();
        DateOfBirth = DateOfBirth.trim();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getStudentID().equals(DateOfBirth)) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;

    }

    //Ham search by last name
    public ArrayList<Student> searchByLastName(String LastName) {
        ArrayList<Student> List = new ArrayList<>();
        LastName = LastName.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getStudentID().contains(LastName)) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;

    }

    //Ham search by gender
    public ArrayList<Student> searchByGender(String Gender) {
        ArrayList<Student> List = new ArrayList<>();
        Gender = Gender.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getStudentID().contains(Gender)) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;

    }

    //ham add new student
    public void addNewStudent() {
        System.out.println("Add new student");
        System.out.println("--------------------------------");

        String newStudentID = null;
        String newFisrtName = null;
        String newLastName = null;
        String newDateOfBisrt = null;
        String newGender = null;

        Scanner s = new Scanner(System.in);

        while (true) {
            newStudentID = Inputter.inputPattern("Enter Student ID (st. ID B0000): ", "[sS][\\d]{4}");
            newStudentID = newStudentID.trim().toUpperCase().replaceAll("\\s+", " ");

            if (checkStudentID(newStudentID) == 0) {
                break;
            } else {
                System.out.println("This Book ID already exist!");
                System.out.println("Please enter again!");
            }

            System.out.println("Enter FisrtName: ");
            newFisrtName = s.nextLine();
            newFisrtName = newFisrtName.trim();

            System.out.println("Enter LastName: ");
            newLastName = s.nextLine();
            newLastName = newLastName.trim().replaceAll("\\s+", " ");

            newDateOfBisrt = Inputter.inputPattern("Enter Date Of Birth (st. dd//mm//yy): ", "[\\d]{2}/[\\d]{2}/[\\d]{4}");
            newDateOfBisrt = newDateOfBisrt.trim().toUpperCase().replaceAll("\\s+", " ");

            System.out.println("Enter Gender");
            newGender = s.nextLine();
            newGender = newGender.trim().replaceAll("\\s+", " ");

            Student newStudent = new Student(newStudentID, newFisrtName, newLastName, newDateOfBisrt, newGender);
            this.add(newStudent);

        }
    }

    //Ham check ID co ton tai hay khong
    private int checkStudentID(String studentID) {
        for (int i = 0; i < this.size(); i++) {
            //equalsIgnoreCase(): so sánh nội dung 2 chuỗi k phân biệt hoa thường
            if (this.get(i).getStudentID().equalsIgnoreCase(studentID)) {
                return 1;
            }
        }
        return 0;
    }

}
