package workshop1.part1;

import java.util.Comparator;
import student_management.Student;

public class SortByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.getGpa(), o2.getGpa());
    }
}
