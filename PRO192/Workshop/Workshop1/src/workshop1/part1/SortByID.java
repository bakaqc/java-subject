package workshop1.part1;

import java.util.Comparator;
import student_management.Student;

public class SortByID implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getId().compareToIgnoreCase(s2.getId());
    }
}
