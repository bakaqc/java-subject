package ex01_QE170097;

import java.util.Scanner;

public class Staff extends Employee {

    private String title;

    public Staff() {
        super();
        this.title = "";
    }

    public Staff(String name, String address, String phone, String email, String office, double salary, String dh, String title) {
        super(name, address, phone, email, office, salary, dh);
        this.title = title;
    }

    @Override
    public void input() {
        super.input();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Title:");
        this.title = s.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + this.title;
    }

    public static void main(String[] args) {
        Staff a = new Staff();
        System.out.println(a);

        Staff b = new Staff("Nguyễn Văn B", "Quy Nhơn", "123456789", "nguyenvanb@gmail.com", "APT", 500, "1/1/2022", "Manager");
        System.out.println(b);

        Staff c = new Staff();
        c.input();
        System.out.println(c);
    }

}
