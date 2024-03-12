package qe170097_dinhquocchuong_pe_csd201;

public class Student {

    private int id;
    private String fullname;
    private int yearOfBirth;
    private double avg;

    public Student() {
    }

    public Student(int id, String fullname, int yearOfBirth, double avg) {
        this.id = id;
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.avg = avg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullname=" + fullname + ", yearOfBirth=" + yearOfBirth + ", avg=" + avg + '}';
    }
    
    
}
