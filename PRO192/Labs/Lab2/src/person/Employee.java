package person;

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

    //Hàm input
    @Override
    public void input() {
        super.input();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter ID: ");
        this.id = s.nextLine();

        System.out.println("Enter Office: ");
        this.office = s.nextLine();

        System.out.println("Enter allowance: ");
        this.allowance = s.nextDouble();

        System.out.println("Enter salary: ");
        this.salary = s.nextDouble();
    }

    //Hàm toString
    @Override
    public String toString() {
        return "Employee " + super.toString() + "id = " + id
                + ", office = " + office + ", allowance = " + allowance + ", salary = " + salary;
    }

//    public static void main(String[] args) {
//        // cha new cha: goi truc tiep vao cac ham cua cha Person
//        Person a = new Person();
//        a.input();;
//        a.output();;
//        System.out.println(a.toString());
//        a.hamCuaChaPerson();
//        
//        //con new con: goi truc tiep vao cac ham cua con, thua ke thi dung ham cua cha neu con chua co
//        Employee e = new Employee();
//        e.input();
//        e.output();
//        System.out.println(e.toString());
//        e.hamCuaChaPerson();
//        e.hamCuaConEmployee();
//        
//        //tinh da hinh khi chay
//        //cha new con: goi truc tiep vao cac ham cua cha nhung ham nao giong nhau thi nhay qua ham cua con
//        Person c = new Employee();
//        c.input();
//        c.output();
//        c.hamCuaChaPerson();
//        System.out.println(c.toString());
}
