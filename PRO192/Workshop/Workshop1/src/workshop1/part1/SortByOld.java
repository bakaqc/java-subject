package workshop1.part1;

import java.util.Comparator;
import student_management.Student;

public class SortByOld implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getOld() - o2.getOld();
    }
}
