package employee;

import employee.MyArrayList;
import person.Validation;
import java.util.Scanner;
import person.Employee;

public class TestEmployee {

    //Hàm input
    public static void input(MyArrayList<Employee> arr) {
        Employee cha;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("1. Regular, 2. Contract: ");
            System.out.println("Enter your choice: ");
            int choice = Validation.checkIntputIntLinmit(1, 2);
            switch (choice) {
                case 1:
                    cha = new Regular();
                    cha.input();
                    arr.add(cha);
                    break;
                case 2:
                    cha = new Contract();
                    cha.input();
                    arr.add(cha);
                    break;
            }
        }

    }

    //Hàm tìm max salary
    public static double maxSalary(MyArrayList<Employee> a) {
        double max = a.get(0).computeSalary();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).computeSalary() > max) {
                max = a.get(i).computeSalary();
            }

        }
        return max;

    }

    //Hàm in tất cả Regular
    public static void printRegular(MyArrayList<Employee> arr) {
        for (int i = 0; i < arr.size(); i++) {
            Employee e = arr.get(i);

            if (e instanceof Regular) {
                System.out.println(e);
            }
        }
    }

    // Hàm remove Contract
    public static void removeContract(MyArrayList<Employee> arr) {
        for (int i = 0; i < arr.size();) {
            Employee e = arr.get(i);

            if (e instanceof Contract) {
                arr.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Removed!!!");
    }

    //Hàm in nhân viên có năm sinh 2k3
    public static void printYear2k3(MyArrayList<Employee> arr) {
        for (int i = 0; i < arr.size(); i++) {
            Employee e = arr.get(i);

            if (e.getDob().getYear() == 2003) {
                System.out.println(e);
            }
        }
    }

    //Hàm thay đổi lương cho nhân viên có địa chỉ Quy Nhơn
    public static void changeSalaryFromQN(MyArrayList<Employee> arr) {
        for (int i = 0; i < arr.size(); i++) {
            Employee e = arr.get(i);

            if (e.getDiaChiNha().getDistrict().equals("QN")) {
                e.setSalary(2000);
            }
        }
        System.out.println("Changed!!!");
    }

    //Hàm sắp xếp Employee tăng dần theo họ tên
    public static void shortByName(MyArrayList<Employee> arr) {
        int n = arr.size();
        if (n == 0) {
            System.out.println("Empty!!!");
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Employee a = arr.get(i);
                Employee b = arr.get(j);
                if (a.getLastname().compareToIgnoreCase(b.getLastname()) > 0) {

                    arr.set(i, b);
                    arr.set(j, a);
                } else if (a.getLastname().compareToIgnoreCase(b.getLastname()) == 0) {
                    if (a.getFirstname().compareToIgnoreCase(b.getFirstname()) > 0) {
                        arr.set(i, b);
                        arr.set(j, a);
                    }
                }
            }
        }
        System.out.println("Sorted!!!");
    }

    public static int choice() {
        int choice;
        System.out.println("|--------------------------------------------------------------------|");
        System.out.println("|--------------------------------MENU--------------------------------|");
        System.out.println("|1. Enter information of Employee                             Press 1|");
        System.out.println("|2. Find the highest salary                                   Press 2|");
        System.out.println("|3. Print all Regular                                         Press 3|");
        System.out.println("|4. Remove all Contract                                       Press 4|");
        System.out.println("|5. Print out all workers with birth year 2003                Press 5|");
        System.out.println("|6. Change in salary of employees with addresses in Quy Nhon  Press 6|");
        System.out.println("|7. Sort employees in ascending order of name                 Press 7|");
        System.out.println("|8. Quit                                                 Press anykey|");
        System.out.println("|--------------------------------------------------------------------|");
        System.out.println("Please enter your choice --> ");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        return choice;
    }

    public static void menu() {
        int c;
        MyArrayList<Employee> a = new MyArrayList<>();
        do {
            c = choice();
            switch (c) {
                case 1:
                    input(a);
                    break;
                case 2:
                    System.out.println("Maxsalary: " + maxSalary(a));
                    break;
                case 3:
                    printRegular(a);
                    break;
                case 4:
                    removeContract(a);
                    break;
                case 5:
                    printYear2k3(a);
                    break;
                case 6:
                    changeSalaryFromQN(a);
                    break;
                case 7:
                    shortByName(a);
                    break;
                default:
                    System.out.println("Thank you and see you again!");
                    break;
            }
        } while (c > 0 && c < 8);
    }

    public static void main(String[] args) {
        menu();
    }
}
