package employee;

import java.util.Scanner;

public class Regular extends Employee {

    private int yearsOfExperience;
    private double rate;
    private double basicSalary;

    public Regular() {
        super();
    }

    public Regular(String firstName, String lastName, boolean gender, String phone, Date dob, Address homeAddress, String id, String office, double allowance, double salary, int yearsOfExperience, double rate, double basicSalary) {
        super(firstName, lastName, gender, phone, dob, homeAddress, id, office, allowance, salary);

        this.yearsOfExperience = yearsOfExperience;
        this.rate = rate;
        this.basicSalary = basicSalary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter years of experience: ");
        this.yearsOfExperience = scanner.nextInt();

        System.out.println("Enter rate: ");
        this.rate = scanner.nextDouble();

        System.out.println("Enter basic salary: ");
        this.basicSalary = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();

        System.out.println(this.yearsOfExperience);
        System.out.println(this.rate);
        System.out.println(this.basicSalary);
    }

    @Override
    public String toString() {
        return "Regular{" + super.toString() + "yearsOfExperience=" + yearsOfExperience + ", rate=" + rate + ", basicSalary=" + basicSalary + '}';
    }

    @Override
    public double computeSalary() {
        return this.rate * this.yearsOfExperience * this.basicSalary;
    }
}