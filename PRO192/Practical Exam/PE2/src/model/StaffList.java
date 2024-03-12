package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import javax.swing.text.PasswordView;

public class StaffList extends ArrayList<Staff> {

    public StaffList() {
        super();
    }

    public void listOfStaff() {
        this.listOfStaff(this);
        this.loadData();
    }

    public void listOfStaff(ArrayList<Staff> List) {
        if (this.isEmpty()) {
            System.out.println("Empty list! ");
            return;
        } else {
            System.out.println("Staff list: ");
            for (int i = 0; i < this.size(); i++) {
                System.out.println(this.get(i));
            }
            System.out.println("Total: " + List.size() + " staff.");
        }
    }

    private void loadData() {
        File f = new File("staff.txt");
        try ( Scanner s = new Scanner(f)) {

            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] row = line.split(":");

                try {
                    this.add(new Staff(row[0], row[1], row[2], row[3]));

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Staff> searchByStaffID(String staffID) {
        ArrayList<Staff> List = new ArrayList<>();
        staffID = staffID.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getStaffID().contains(staffID)) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;
    }

    public ArrayList<Staff> searchByName(String name) {
        ArrayList<Staff> List = new ArrayList<>();
        name = name.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getFullName().contains(name)) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;
    }

    public ArrayList<Staff> searchByDepartment(String department) {
        ArrayList<Staff> List = new ArrayList<>();
        department = department.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getFullName().contains(department)) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;
    }

    public void loginToSystem(String staffID, String password) {
        if (checkStaffID(staffID) == 0) {
            if (checkPassword(password) == 0) {
                System.out.println("Welcome to System!");
            } else {
                System.out.println("Sorry! Password incorrect!");
            }
        }else
            System.out.println("Account not exist!");
    }

    private int checkPassword(String password) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getPassword().equals(password)) {
                return 1;
            }
        }
        return 0;
    }

    private int checkStaffID(String staffID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getStaffID().equalsIgnoreCase(staffID)) {
                return 1;
            }
        }
        return 0;
    }
}
