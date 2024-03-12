package ex01_QE170097;

import java.util.Scanner;

public class Employee extends Person {

    private String office;
    private double salary;
    private String dh;

    // khoi tao ham k doi so
    public Employee() {
        super();
        this.dh = this.office = "";
        this.salary = 0.0;
    }

    // khoi tao ham co doi so
    public Employee(String name, String address, String phone, String email, String office, double salary, String dh) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dh = dh;
    }

    @Override
    public void input() {
        super.input();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Office: ");
        this.office = s.nextLine();

        System.out.println("Enter Salary: ");
        this.salary = s.nextDouble();
        s.nextLine();

        System.out.println("Enter Date-hired: ");
        this.dh = s.nextLine();

    }

    @Override
    public String toString() {
        return super.toString() + "\n" + this.office + "\n" + this.salary + "\n" + this.dh;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e);

        Employee c = new Employee("Đinh Quốc Chương",
                "Quy Nhon", "0363475716", "chuongdqqe170097@fpt.edu.vn",
                "FPT", 0, "18/10/2021");
        System.out.println(c);

        Employee a = new Employee();
        a.input();
        System.out.println(a);

    }

}
