package ex01_QE170097;

import java.util.Scanner;

public class Faculty extends Employee {

    private int office_hour;
    private String rank;

    public Faculty() {
        super();
        this.office_hour = 0;
        this.rank = "";
    }

    public Faculty(String name, String address, String phone, String email, String office, double salary, String dh, int office_hour, String rank) {
        super(name, address, phone, email, office, salary, dh);
        this.office_hour = office_hour;
        this.rank = rank;
    }

    @Override
    public void input() {
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Office_hour: ");
        this.office_hour = s.nextInt();
        
        System.out.println("Enter Rank: ");
        this.rank = s.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + this.office_hour + "\n" + this.rank;
    }

    public static void main(String[] args) {
        Faculty a = new Faculty();
        System.out.println(a);

        Faculty b = new Faculty("Nguyen Van B", "Quy Nhon", "123456789", "nguyenvanb@gmail.com", "FPT", 500, "1/1/2021", 8, "Lecturers");
        System.out.println(b);

        Faculty c = new Faculty();
        c.input();
        System.out.println(c);
    }

}
