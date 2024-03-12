package person;

import java.util.Scanner;

public class Date {

    private int day;
    private int month;
    private int year;

    //Hàm khởi tạo k đối số
    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    //Hàm khởi tạo có đối số
    public Date(int date, int month, int year) {
        this.day = date;
        this.month = month;
        this.year = year;
    }

    //Hàm get, set
    public void setDay(int day) {
        if (year < 1 || year > 31) {
            this.day = 1;
        } else {
            this.year = year;
        }
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            this.month = 1;
        } else {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year < 1000 || year > 5000) {
            this.year = 1000;
        } else {
            this.year = year;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    //Cài đặt phương thức
    public boolean leapYear() {
        return ((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0);
    }

    public int sumOfDayInMonth(int month) {
        switch (this.month) {
            case 4,6,9,11:
                return 30;
            case 2:
                return (this.leapYear() ? 29 : 28);
            default:
                return 31;
        }

    }

    //Hàm input
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter day of birth");
        System.out.println("Input year: ");
        this.year = Validation.checkIntputIntLinmit(1000, 5000);
        System.out.println("Input month: ");
        this.month = Validation.checkIntputIntLinmit(1, 12);
        System.out.println("Input day: ");
        this.day = Validation.checkIntputIntLinmit(1, sumOfDayInMonth(month));
    }

    //Hàm toString
    @Override
    public String toString() {
        return "Date: " + this.day + "/" + this.month + "/" + this.year;
    }

    public static void main(String[] args) {
        Date dob;
        dob = new Date();
        System.out.println(dob);
        dob.input();
        System.out.println(dob);

        Date dob1 = new Date(2, 2, 2222);
        System.out.println(dob1);

        dob = dob1;
        System.out.println(dob);
    }

}
