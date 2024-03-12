package model;

public class Staff {

    private String staffID, fullName, department, password;

    public Staff() {
    }

    public Staff(String staffID, String fullName, String department, String password) {
        this.staffID = staffID;
        this.fullName = fullName;
        this.department = department;
        this.password = password;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public String getPassword() {
        return password;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Staff{" + staffID + ":" + fullName + ":" + department + ":" + password + "}";
    }

    public int changePassword(Staff s) {
        if (this.password.compareTo(s.password) == 0) {
            return 0;
        } else {
            if (this.password.compareTo(s.password) > 0) {
                return 1;
            } else {
                return -1;
            }
        }

    }

}
