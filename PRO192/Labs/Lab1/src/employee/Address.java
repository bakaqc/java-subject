package employee;

import java.util.Scanner;

public class Address {

    private String number;
    private String street;
    private String district;
    private String city;

    public Address() {
        this.number = this.street = this.district = this.city = "";
    }

    public Address(String number, String street, String district, String city) {
        this.number = number;
        this.street = street;
        this.district = district;
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "number=" + number + ", street=" + street + ", district=" + district + ", city=" + city + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        this.number = sc.nextLine();
        this.street = sc.nextLine();
        this.district = sc.nextLine();
        this.city = sc.nextLine();
    }
}
