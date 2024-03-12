package employee;

import java.util.Scanner;

public class Contract extends Employee{
    private double grateSlary;

    public Contract() {
        super();
    }

    public Contract(String firstname, String lastname, boolean gender, String phone, Date dob1, 
            Address diaChiNha1, String id, String office, double allowance, double salary, double grateSlary) {
        super(firstname, lastname, gender, phone, dob1, diaChiNha1, id, office, allowance, salary);
        this.grateSlary = grateSlary;
    }

    public double getGrateSlary() {
        return grateSlary;
    }

    public void setGrateSlary(double grateSlary) {
        this.grateSlary = grateSlary;
    }

    @Override
    public void input() {
        super.input();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Grate Slary: ");
        this.grateSlary = s.nextDouble();
    }

    @Override
    public String toString() {
        return "Contract{" + "grateSlary=" + grateSlary + '}';
    }
    
    public double computeSalary(){
        return grateSlary + allowance;
    }
    
}
