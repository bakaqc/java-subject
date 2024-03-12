package students_jdbc;

import java.util.*;
import java.sql.*;

public class StudentManagement extends ArrayList<Student> {

    private static String sql = "SELECT * FROM student";

//  Print all Student
    public static void printAllStudent() {
        try {
            Connection c = ConnectSQL.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            System.out.format("%-15s%-20s%-10s%-10s\n", "ID", "Name", "Old", "GPA");

            while (rs.next()) {
                System.out.format("%-15s%-20s%-10s%-10s\n", rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4));
            }
            c.close();
        } catch (Exception e) {
        }
    }

    public static void printStudent(String id) {
        try {
            Connection c = ConnectSQL.getConnection();
            String sql1 = "SELECT * FROM student WHERE ID = '" + id +"'";
            PreparedStatement st = c.prepareStatement(sql1);
            ResultSet rs = st.executeQuery();
            System.out.format("%-15s%-20s%-10s%-10s\n", "ID", "Name", "Old", "GPA");

            while (rs.next()) {
                System.out.format("%-15s%-20s%-10s%-10s\n", rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4));
            }

            c.close();
        } catch (Exception e) {
        }
    }

//  Add new Student
    public static void addStudent() {
        System.out.println("Add new student");
        System.out.println("--------------------------------");

        Scanner s = new Scanner(System.in);
        try {
            Connection c = ConnectSQL.getConnection();
            Statement st = c.createStatement();

            while (true) {
                String newId = Check_Input.inputPattern("Enter Student ID (st. ID S00): ", "[sS][\\d]{2}");
                newId = newId.toUpperCase().replaceAll("\\s+", "");

                if (checkStudentID(newId) == null) {
                    String newName = Check_Input.inputStr("Enter Name: ");
                    int newOld = Check_Input.inputInt("Enter Old: ", 1, 100);
                    float newGPA = Check_Input.inputFloat("Enter GPA: ", 0, 4.f);

                    String sql = "INSERT INTO student (ID, NAME, OLD, GPA) "
                            + "VALUES ('" + newId + "', '" + newName + "', " + newOld + ", " + newGPA + ")";
                    st.executeUpdate(sql);
                    c.close();

                    System.out.println("You has added Student " + newId);

                    break;
                } else {
                    System.out.println("ID " + newId + " has existed!");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //Check ID existed or not

    private static String checkStudentID(String stID) {
        try {
            Connection c = ConnectSQL.getConnection();
            String sqlGetId = "SELECT ID FROM student";
            PreparedStatement st = c.prepareStatement(sqlGetId);
            ResultSet rs = st.executeQuery(sqlGetId);
            List<String> oldID = new ArrayList<>();
            while (rs.next()) {
                oldID.add(rs.getString(1));
            }
            c.close();

            String newId = stID.replaceAll("\\s+", "");
            for (int i = 0; i < oldID.size(); i++) {
                if (oldID.get(i).equalsIgnoreCase(newId)) {
                    return oldID.get(i);
                }
            }

            return null;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    //  Edit information of student
    public static void editInforStudent() {
        Scanner s = new Scanner(System.in);

        try {
            Connection c = ConnectSQL.getConnection();

            String id = Check_Input.inputPattern("Enter Student ID to check(st. ID S00): ", "[sS][\\d]{2}");
            id = id.toUpperCase().replaceAll("\\s+", "");

            if (checkStudentID(id) != null) {

                System.out.println("Enter new Name: ");
                String newName = s.nextLine();

                System.out.println("Enter new Old: ");
                int newOld = s.nextInt();

                System.out.println("Enter new GPA: ");
                float newGPA = s.nextFloat();

                String sql2 = "UPDATE student SET name = ?, old = ?, GPA = ? WHERE ID = ?;";
                PreparedStatement stmt = c.prepareStatement(sql2);
                stmt.setString(1, newName);
                stmt.setInt(2, newOld);
                stmt.setFloat(3, newGPA);
                stmt.setString(4, id);

                stmt.executeUpdate();
                c.close();

                System.out.println("Student " + id + " has been updated.");

            } else {
                System.out.println("Student " + id + " doesn't existed!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void remove() {
        String op[] = {"Remove a Student", "Remove All Student", "Quit"};
        int choose = 0;
        do {
            choose = FormMenu.getChoice(op);
            switch (choose) {
                case 1:
                    removeStudent();
                    break;
                case 2:
                    removeAllStudent();
                    break;
                default:
                    System.out.println("See you again!");
                    break;
            }
        } while (choose > 0 && choose < 3);
    }

// Remove a student
    public static void removeStudent() {
        try {
            Connection c = ConnectSQL.getConnection();
            String id = Check_Input.inputPattern("Enter Student ID to check(st. ID S00): ", "[sS][\\d]{2}");
            id = id.toUpperCase().replaceAll("\\s+", "");
            if (checkStudentID(id) == null) {
                System.out.println("Student " + id + " doesn't existed!");

            } else {
                String sql1 = "DELETE FROM student WHERE ID = '" + id + "'";
                PreparedStatement stm = c.prepareStatement(sql1);
                stm.executeUpdate();
                c.close();
                System.out.println("Student " + id + " has removed!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Remove all student
    public static void removeAllStudent() {
        try {
            Connection c = ConnectSQL.getConnection();
            String sql1 = "DELETE FROM student";
            PreparedStatement stm = c.prepareStatement(sql1);
            stm.executeUpdate();
            c.close();
            System.out.println("All student in database has removed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Search by ID
    public static void searchByID() {
        String id = Check_Input.inputPattern("Enter Student ID (st. ID S00): ", "[sS][\\d]{2}");
        id = id.toUpperCase().replaceAll("\\s+", "");
        if (checkStudentID(id) != null) {
            printStudent(id);
        } else {
            System.out.println("Not found!");
        }
    }

}
