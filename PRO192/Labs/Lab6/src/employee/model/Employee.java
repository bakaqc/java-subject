package employee.model;

import java.util.Scanner;

public abstract class Employee extends Person {

    protected String id;
    protected String office;
    protected double allowance;
    protected double salary;

    //Hàm khoi tao k doi so
    public Employee() {
        super();
        this.id = this.office = "";
        this.allowance = this.salary = 0;
    }

    // khoi tao ham co doi so
    public Employee(String firstname, String lastname, boolean gender, String phone, Date dob1, Address diaChiNha1, String id, String office, double allowance, double salary) {
        super(firstname, lastname, gender, phone, dob1, diaChiNha1);
        this.id = id;
        this.office = office;
        this.allowance = allowance;
        this.salary = salary;
    }

    //Hàm get,set
    public String getId() {
        return id;
    }

    public String getOffice() {
        return office;
    }

    public double getAllowance() {
        return allowance;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Cài đặt phương thức
    public void hamCuaConEmployee() {
        System.out.println("Day la ham cua con lop Employee");
    }

    public abstract double computeSalary();

    //Hàm toString
    @Override
    public String toString() {
        return "Employee: " + super.toString() + ", id = " + id
                + ", office = " + office + ", allowance = " + allowance + ", salary = " + salary;
    }

}
