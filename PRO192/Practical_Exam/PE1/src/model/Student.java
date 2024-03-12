package model;

public class Student {

    private String studentID, fisrtName, lastName, dateOfBirth, gender;

    public Student(String studentID, String fisrtName, String lastName, String dateOfBirth, String gender) {
        this.studentID = studentID;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + studentID + ":" + fisrtName + lastName + ":" + dateOfBirth + ":" + gender + '}';
    }

    public int comparableLastName(Student s) {
        if (this.getLastName().compareTo(s.lastName) == 0) {
            return 0;
        } else if (this.getLastName().compareTo(s.lastName) > 0) {
            return 1;
        } else {
            return -1;
        }

    }
}
