package w8.generics.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        HumanComparator hc = new HumanComparator();
        int compare = hc.compare(o1,o2);
        if(compare ==0){
            return o1.studentId-o2.studentId;
        }
        else return compare;

    }
}
