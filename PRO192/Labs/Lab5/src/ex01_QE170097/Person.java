package ex01_QE170097;

import java.util.Scanner;

public class Person {

    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    // hàm khởi tạo k có đối số
    public Person() {
        this.name = "";
        this.address = "";
        this.phone = "";
        this.email = "";
    }

    // hàm khởi tạo có 4 đối số
    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // tạo phương thức nhập
    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Name: ");
        this.name = kb.nextLine();
        System.out.println("Enter Address: ");
        this.address = kb.nextLine();
        System.out.println("Enter Phone: ");
        this.phone = kb.nextLine();
        System.out.println("Enter Email: ");
        this.email = kb.nextLine();
    }

    public String toString() {
        return this.name + "\n" + this.address + "\n" + this.phone + "\n" + this.email;
    }

    public static void main(String[] args) {
//        Person a = new Person();
//        a.output();

        Person chuong = new Person("Dinh Quoc Chuong", "Quy Nhon", "0363475716", "chuongdqqe170097@fpt.edu.vn");
        System.out.println(chuong.toString());

        Person b = new Person();
        b.input();
        System.out.println();
        System.out.println(b);
    }

}
