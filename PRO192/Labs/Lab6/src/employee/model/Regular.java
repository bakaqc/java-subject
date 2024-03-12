package employee.model;

import java.util.Scanner;
import employee.model.Address;
import employee.model.Date;
import employee.model.Employee;

public class Regular extends Employee {

    private int yearsOfExperience;
    private double rate, basicSalary;

    //Hàm khởi tạo k đối số
    public Regular() {
        super();
    }

    //Hàm khởi tạo có đối số
    public Regular(String firstname, String lastname, boolean gender, String phone, Date dob1,
            Address diaChiNha1, String id, String office, double allowance, double salary,
            int yearsOfExperience, double rate, double basicSalary) {
        super(firstname, lastname, gender, phone, dob1, diaChiNha1, id, office, allowance, salary);
        this.yearsOfExperience = yearsOfExperience;
        this.rate = rate;
        this.basicSalary = basicSalary;
    }

    //Hàm get,set
    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    //Cài đặt phương thức
    public double computeSalary() {
        return this.rate * this.yearsOfExperience * this.basicSalary + this.allowance;
    }

    //Hàm toString
    @Override
    public String toString() {
        return "Regular{" + super.toString() + "yearsOfExperience = " + this.yearsOfExperience + ", rate = " + this.rate + ", basicSalary = " + this.basicSalary + '}';
    }
}
