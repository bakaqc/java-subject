package person;

import java.util.Scanner;

public class Person {

    protected String firstname;
    protected String lastname;
    protected boolean gender;
    protected String phone;
    protected Date dob;//moi
    protected Address diaChiNha;//moi

    //Hàm khởi tạo k có đối số
    public Person() {
        this.firstname = "";
        this.lastname = "";
        this.gender = true;
        this.phone = "";
        this.dob = new Date();//moi
        this.diaChiNha = new Address();
    }

    //Hàm khởi tạo có đối số
    public Person(String firstname, String lastname, boolean gender, String phone, Date dob1, Address diaChiNha1) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.phone = phone;
        this.dob = dob1;
        this.diaChiNha = diaChiNha1;
    }

    //Hàm get, set
    public Date getDob() {
        return dob;
    }

    public Address getDiaChiNha() {
        return diaChiNha;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setDiaChiNha(Address diaChiNha) {
        this.diaChiNha = diaChiNha;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public boolean isGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void hamCuaChaPerson() {
        System.out.println("Day la ham cua cha lop Person");
    }

    //Hàm input, output
    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter information");
        System.out.println("Enter Firstname: ");
        this.firstname = kb.nextLine();
        System.out.println("Enter Lastname: ");
        this.lastname = kb.nextLine();
        System.out.println("Enter Gender: ");
        this.gender = kb.nextBoolean();
        kb.nextLine();
        System.out.println("Enter Phone: ");
        this.phone = kb.nextLine();

        this.dob.input();
        this.diaChiNha.input();
    }

    public void output() {
        System.out.println(this.firstname);
        System.out.println(this.lastname);
        System.out.println(this.gender);
        System.out.println(this.phone);
    }

    //Hàm toString
    @Override
    public String toString() {
        return "firstname = " + firstname + ", lastname = " + lastname + ", gender = " + gender + ", phone = " + phone + ", dob = " + dob + ", diaChiNha = " + diaChiNha + '}';
    }


    public static void main(String[] args) {
//        Person a = new Person();
//        a.input();
//        System.out.println(a);
//        
        Date dob1 = new Date(2, 2, 2222);
        System.out.println(dob1);

        Address diaChiNha1 = new Address("123", "Ngô Mây", "Ngô Mây", "Quy Nhơn");
        Address diaChiNha2 = new Address("456", "Hoang Van Thu", "Ngô Mây", "Quy Nhơn");

        Person b = new Person("b", "nguyen van", true, "113", new Date(2, 2, 2222), diaChiNha1);
        System.out.println(b);

        Person c = new Person("c", "le van", true, "113", new Date(2, 2, 2222), diaChiNha2);
        System.out.println(c);

        System.out.println(c.getDob().getDay());

    }
}
