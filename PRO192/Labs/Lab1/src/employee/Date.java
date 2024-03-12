package employee;

import validation.Validation;

public final class Date {

    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public Date(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public boolean leapYear() {
        return ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0));
    }

    public int sumOfDayInMonth() {
        switch (this.month) {
            case 4, 6, 9, 11 -> {
                return 30;
            }

            case 2 -> {
                return this.leapYear() ? 29 : 28;
            }

            default -> {
                return 31;
            }
        }
    }

    public Date nextDate() {
        if (++this.day > this.sumOfDayInMonth()) {
            this.day = 1;

            if (++this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }

        return this;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 1 && day < this.sumOfDayInMonth()) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 1 && month < 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1990) {
            this.year = year;
        } else {
            this.year = 1990;
        }
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    public void input() {
        System.out.println("Enter year:");
        this.year = Validation.checkInputIntLimit(1990, 3000);

        System.out.println("Enter month:");
        this.month = Validation.checkInputIntLimit(1, 12);

        System.out.println("Enter day:");
        this.day = Validation.checkInputIntLimit(1, this.sumOfDayInMonth());
    }
}
