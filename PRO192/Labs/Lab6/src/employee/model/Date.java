package employee.model;

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
    //Hàm toString

    @Override
    public String toString() {
        return "Date{" + ", day=" + day + ", month=" + month + ", year=" + year + '}';
    }
    
}

  




