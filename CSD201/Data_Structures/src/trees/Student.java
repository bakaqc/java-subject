package trees;

public class Student {
    private int id;
    private String fullname;
    private int yearOfBirth;
    private float gpa;

    public Student() {
    }

    public Student(int id, String fullname, int yearOfBirth, float gpa) {
        this.id = id;
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public float getGpa() {
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student {" + "id = " + id + ", fullname = " + fullname + ", yearOfBirth = " + yearOfBirth + ", gpa = " + gpa + '}';
    }
    
 

    
}
