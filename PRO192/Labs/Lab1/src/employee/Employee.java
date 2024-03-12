package employee;

import java.util.Scanner;

public abstract class Employee extends Person {
    
    protected String id;
    protected String office;
    protected double allowance;
    protected double salary;
    
    // No-argument constructor
    public Employee() {
        super();
        
        this.id = this.office = "";
        this.allowance = this.salary = 0.0;
    }

    // Constructor with 8 arguments
    public Employee(String firstName, String lastName, boolean gender, String phone, Date dob, Address homeAddress, String id, String office, double allowance, double salary) {
        super(firstName, lastName, gender, phone, dob, homeAddress);
        
        this.id = id;
        this.office = office;
        this.allowance = allowance;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void input() {
        super.input();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter id: ");
        this.id = scanner.nextLine();
        
        System.out.println("Enter office: ");
        this.office = scanner.nextLine();
        
        System.out.println("Enter allowance: ");
        this.allowance = scanner.nextDouble();
        
        System.out.println("Enter salary: ");
        this.salary = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        
        System.out.println(this.id);
        System.out.println(this.office);
        System.out.println(this.allowance);
        System.out.println(this.salary);
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + "id=" + id + ", office=" + office + ", allowance=" + allowance + ", salary=" + salary + '}';
    }
    
    public abstract double computeSalary();
}