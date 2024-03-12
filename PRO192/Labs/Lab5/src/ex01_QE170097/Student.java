package ex01_QE170097;

import java.util.Scanner;

public class Student extends Person {

    private int class_status;

    // khoi tao ham k co doi so
    public Student() {
        super();
        this.class_status = 0;
    }

    // khoi tao ham co doi so
    public Student(String name, String address, String phone, String email, int education) {
        super(name, address, phone, email);
        this.class_status = education;
    }

    @Override
    public void input() {
        super.input();
        Scanner e = new Scanner(System.in);
        System.out.println("Enter Education: ");
        this.class_status = e.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Education:" + this.class_status;
    }

    public static void main(String[] args) {
        Student a = new Student();
        System.out.println(a.toString());

        Student chuong = new Student("Đinh Quốc Chương", "Quy Nhơn", "0363475716", "chuongdqqe170097@fpt.edu.vn", 2);
        System.out.println(chuong);

        Student b = new Student();
        b.input();
        System.out.println(b.toString());
    }

}
