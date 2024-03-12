package employee.model;

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

    //Hàm toString
    @Override
    public String toString() {
        return "firstname = " + firstname + ", lastname = " + lastname + ", gender = " + gender + ", phone = " + phone + ", dob = " + dob + ", diaChiNha = " + diaChiNha;
    }

}
