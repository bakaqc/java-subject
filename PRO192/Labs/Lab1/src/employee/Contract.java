package employee;

import java.util.Scanner;

public class Contract extends Employee {

    private double gradeSalary;

    public Contract() {
        super();
    }

    public Contract(String firstName, String lastName, boolean gender, String phone, Date dob, Address homeAddress, String id, String office, double allowance, double salary, double gradeSalary) {
        super(firstName, lastName, gender, phone, dob, homeAddress, id, office, allowance, salary);

        this.gradeSalary = gradeSalary;
    }

    public double getGradeSalary() {
        return gradeSalary;
    }

    public void setGradeSalary(double gradeSalary) {
        this.gradeSalary = gradeSalary;
    }

    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grade salary: ");
        this.gradeSalary = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();

        System.out.println(this.gradeSalary);
    }

    @Override
    public String toString() {
        return "Contract{" + super.toString() + "gradeSalary=" + gradeSalary + '}';
    }

    @Override
    public double computeSalary() {
        return this.gradeSalary + this.salary;
    }
}