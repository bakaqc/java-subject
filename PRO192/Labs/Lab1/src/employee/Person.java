package employee;

import java.util.Scanner;

public class Person {

    protected String firstName;
    protected String lastName;
    protected boolean gender;
    protected String phone;
    protected Date dob;
    protected Address homeAddress;

    // No-argument constructor
    public Person() {
        this.firstName = this.lastName = this.phone = "";
        this.gender = true;

        this.dob = new Date();
        this.homeAddress = new Address();
    }

    public Person(String firstName, String lastName, boolean gender, String phone, Date dob, Address homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phone = phone;
        this.dob = dob;
        this.homeAddress = homeAddress;
    }

    public Date getDob() {
        return dob;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("Enter gender: ");
        this.gender = scanner.nextBoolean();

        System.out.println("Enter phone: ");
        this.phone = scanner.nextLine();

        System.out.println("Enter day of birth:");
        this.dob.input();
    }

    public void output() {
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.gender ? "Male" : "Female");
        System.out.println(this.phone);
        System.out.println(dob);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", phone=" + phone + ", dob=" + dob + "homeAdress=" + homeAddress + +'}';
    }
}
