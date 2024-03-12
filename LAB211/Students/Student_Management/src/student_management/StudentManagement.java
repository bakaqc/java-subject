package student_management;

import java.util.*;

public class StudentManagement extends ArrayList<Student> {

    public StudentManagement() {
        super();
    }
//  Show all Student

    public void printAllStudent() {
        this.printStudentList(this);
    }

//  Show any Student 
    public void printStudentList(ArrayList<Student> List) {
        if (this.isEmpty()) {
            System.out.println("Empty list! ");
        } else {
            System.out.println("Student List: ");
            for (Student st : this) {
                System.out.println(st);
            }
//            System.out.println("Total: " + this.size() + " student(s).");
        }
    }

//  Add new Student
    public void addStudent() {
        System.out.println("Add new student");
        System.out.println("--------------------------------");

        String newID = null;
        String newName = null;
        int newOld = 0;
        float newGPA = 0.f;

        Scanner s = new Scanner(System.in);

        while (true) {
            newID = Check_Input.inputPattern("Enter Student ID (st. ID S00): ", "[sS][\\d]{2}");
            newID = newID.trim().toUpperCase().replaceAll("\\s+", "");
            if (checkStudentID(newID) == null) {
                System.out.println("Enter Name of Student: ");
                newName = s.nextLine();

                do {
                    System.out.println("Enter Old of Student: ");
                    newOld = s.nextInt();
                } while (newOld <= 0);

                do {
                    System.out.println("Enter GPA of Student: ");
                    newGPA = s.nextFloat();
                } while (newGPA < 0 || newGPA > 4.0);

                Student newStudent = new Student(newID, newName, newOld, newGPA);
                this.add(newStudent);
                break;
            } else {
                System.out.println("This Student ID already exist!");
                System.out.println("Please enter again!");
            }

        }
    }

    //Check ID existed or not
    private Student checkStudentID(String stID) {
        stID = stID.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {

            if (this.get(i).getId().equalsIgnoreCase(stID)) {
                return this.get(i);
            }
        }
        return null;
    }

    //  Edit information of student
    public void editInforStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list. No update can be performed!");
        } else {
            String id = Check_Input.inputStr("Enter Student ID for search: ");
            Student st = this.checkStudentID(id);
            if (st == null) {
                System.out.println("Student " + id + " doesn't existed!");
            } else {
                System.out.println("Information of student " + id);
                System.out.println(st);
                String oldId = st.getId();
                String msg = "Old Id: " + oldId;
                String newId = Check_Input.inputPattern("Enter new ID (st. ID S00): ", "[sS][\\d]{2}");
                newId = newId.trim().toUpperCase().replaceAll("\\s+", "");
                if (checkStudentID(newId) == null) {
                    st.setId(newId);

                    String oldName = st.getName();
                    msg = "Old name: " + oldName + ", new name: ";
                    String newName = Check_Input.inputNonBlankStr(msg);
                    st.setName((newName));

                    int old = st.getOld();
                    msg = "Old age: " + old + ", New age: ";
                    int newOld = Check_Input.inputInt(msg, 1, 100);
                    st.setOld(newOld);

                    float gpa = st.getGpa();
                    msg = "Old GPA: " + gpa + ", New GPA: ";
                    float newGPA = Check_Input.inputFloat(msg, 0.f, 4.f);
                    st.setGpa(newGPA);

                    System.out.println("Student " + id + " has been updated.");
                } else {
                    System.out.println("This Student ID already exist!");
                    System.out.println("Please enter again!");
                }

            }

        }
    }
//  Sort list student

    public void sort() {
        String op[] = {"Sort by ID", "Sort by Old", "Sort by GPA"};
        int choose = 0;
        Scanner s = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        choose = FormMenu.getChoice(op);
        switch (choose) {
            case 1:
                sortByID();
                System.out.println("The list of students has been sorted by Id!");
                break;
            case 2:
                sortByOld();
                System.out.println("The list of students has been sorted by Old!");
                break;
            case 3:
                sortByGPA();
                System.out.println("The list of students has been sorted by GPA!");
                break;
            default:
                System.out.println("See you again!");
                break;
        }
    }

//  Sort by ID
    public void sortByID() {
        Collections.sort(this, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getId().compareToIgnoreCase(s2.getId()) < 0) {
                    return -1;
                } else if (s1.getId().compareToIgnoreCase(s2.getId()) > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }

        });

    }

//  Sort by Old
    public void sortByOld() {
        Collections.sort(this, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getOld() < s2.getOld()) {
                    return -1;
                } else if (s1.getOld() > s2.getOld()) {
                    return 1;
                } else {
                    return 0;
                }
            }

        });
    }

//  Sort by GPA
    public void sortByGPA() {
        Collections.sort(this, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getGpa() < s2.getGpa()) {
                    return -1;
                } else if (s1.getGpa() > s2.getGpa()) {
                    return 1;
                } else {
                    return 0;
                }
            }

        });
    }

//  Search Student
    public void search() {
        String op[] = {"Search by ID", "Search by Old", "Search by GPA", "Return MENU"};
        int choose = 0;
        Scanner s = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        do {
            choose = FormMenu.getChoice(op);
            switch (choose) {
                case 1:
                    String id = Check_Input.inputPattern("Enter Id to search (st. ID S00): ", "[sS][\\d]{2}");
                    id = id.trim().toUpperCase().replaceAll("\\s+", "");
                    System.out.println("List of students searched by Id: " + id + "\n");
                    list(searchByID(id));
                    break;
                case 2:
                    System.out.println("Enter Old to search: ");
                    int old = s.nextInt();
                    System.out.println("List of students searched by Old: " + old + "\n");
                    list(searchByOld(old));
                    break;
                case 3:
                    System.out.println("Enter GPA to search: ");
                    float GPA = s.nextFloat();
                    System.out.println("List of students searched by GPA: " + GPA + "\n");
                    list(searchByGPA(GPA));
                    break;
                default:
                    System.out.println("See you again!");
                    break;
            }
        } while (choose > 0 && choose < 4);

    }

//  List find
    public void list(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println();
        }
    }

//  Search by ID
    public ArrayList<Student> searchByID(String StudentID) {
        ArrayList<Student> List = new ArrayList<>();
        StudentID = StudentID.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getId().equalsIgnoreCase(StudentID)) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;
    }

//  Search by Old
    public ArrayList<Student> searchByOld(int old) {
        ArrayList<Student> List = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getOld() == old) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;
    }

//  Search by Old
    public ArrayList<Student> searchByGPA(float GPA) {
        ArrayList<Student> List = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getGpa() == GPA) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;

    }

// Remove a student
    public void removeStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list. No remove can be performed!");
        } else {
            String id = Check_Input.inputStr("Enter Id of student you want remove: ");
            Student st = this.checkStudentID(id);
            if (st == null) {
                System.out.println("Student " + id + " doesn't existed!");
            } else {
                this.remove(st);
                System.out.println("Student " + id + " has been removed.");
            }
        }
    }
}
