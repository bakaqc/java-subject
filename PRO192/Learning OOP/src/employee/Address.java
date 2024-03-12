package employee;

import java.util.Scanner;

public class Address {

    private String number, street, district, city;

    public Address() {
        this.number = "";
        this.street = "";
        this.district = "";
        this.city = "";
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

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        this.number = s.nextLine();
        System.out.println("Enter Street: ");
        this.street = s.nextLine();
        System.out.println("Enter District: ");
        this.district = s.nextLine();
        System.out.println("Enter City: ");
        this.city = s.nextLine();
    }

    @Override
    public String toString() {
        return "Address:" + "number=" + number + ", street=" + street
                + ", district=" + district + ", city=" + city;
    }
    
    

}
