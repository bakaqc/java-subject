package employee;

import java.util.Scanner;

public class Regular extends Employee {

    private int yearsOfExperience;
    private double rate, basicSalary;

    public Regular() {
        super();
    }

    public Regular(String firstname, String lastname, boolean gender, String phone, Date dob1,
            Address diaChiNha1, String id, String office, double allowance, double salary,
            int yearsOfExperience, double rate, double basicSalary) {
        super(firstname, lastname, gender, phone, dob1, diaChiNha1, id, office, allowance, salary);
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
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Years Of Experience: ");
        this.yearsOfExperience = s.nextInt();

        System.out.println("Enter Rate: ");
        this.rate = s.nextDouble();

        System.out.println("Enter Basic Salary: ");
        this.basicSalary = s.nextDouble();
    }

    @Override
    public String toString() {
        return "Regular{" + "yearsOfExperience=" + yearsOfExperience + ", rate=" + rate + ", basicSalary=" + basicSalary + '}';
    }

    public double computeSalary(){
        return rate * basicSalary + allowance;
    }
}
