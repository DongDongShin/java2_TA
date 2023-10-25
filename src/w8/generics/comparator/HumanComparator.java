package w8.generics.comparator;

import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
//        int i = o1.name.compareTo(o2.name);
//        if (i == 0) {
//            i = o1.age - o2.age;
//        }
//        return i;
        if (o1.name.compareTo(o2.name) > 0) { //String 비교
            return 1;
        } else if (o1.name.compareTo(o2.name) < 0) {
            return -1;
        } else {
            return o1.age - o2.age;
        }
    }
}
