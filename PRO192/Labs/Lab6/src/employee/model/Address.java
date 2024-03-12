package employee.model;

import java.util.Scanner;

public class Address {

    private String number, street, district, city;

    //Hàm khởi tạo k đối số
    public Address() {
        this.number = "";
        this.street = "";
        this.district = "";
        this.city = "";
    }

    //Hàm khởi tạo có đối số
    public Address(String number, String street, String district, String city) {
        this.number = number;
        this.street = street;
        this.district = district;
        this.city = city;
    }

    //Hàm get, set
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //Hàm toString
    @Override
    public String toString() {
        return "Address:" + "number=" + this.number + ", street=" + this.street
                + ", district=" + this.district + ", city=" + this.city;
    }

}
