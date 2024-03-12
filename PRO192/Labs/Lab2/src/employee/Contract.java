package employee;

import java.util.Scanner;
import person.Address;
import person.Date;
import person.Employee;

public class Contract extends Employee {

    private double grateSlary;

    //Hàm khởi tạo k đối số
    public Contract() {
        super();
    }

    //Hàm khởi tạo có đối số
    public Contract(String firstname, String lastname, boolean gender, String phone, Date dob1,
            Address diaChiNha1, String id, String office, double allowance, double salary, double grateSlary) {
        super(firstname, lastname, gender, phone, dob1, diaChiNha1, id, office, allowance, salary);
        this.grateSlary = grateSlary;
    }

    //Hàm get,set
    public double getGrateSlary() {
        return this.grateSlary;
    }

    public void setGrateSlary(double grateSlary) {
        this.grateSlary = grateSlary;
    }

    //Cài đặt phương thức
    public double computeSalary() {
        return this.grateSlary + this.allowance;
    }

    //Hàm input
    @Override
    public void input() {
        super.input();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Grate Slary: ");
        this.grateSlary = s.nextDouble();
    }

    //Hàm toString
    @Override
    public String toString() {
        return "Contract{" + "grateSlary=" + this.grateSlary + '}';
    }

}
