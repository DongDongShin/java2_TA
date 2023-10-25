package w8.generics;

import java.util.List;

public class GenericReverser {


    public static <E> void reverse(List<E> list) {

        int size = list.size();
        E e;
        for (int i = 0; i < size - 1; i++) {
            e = list.remove(size - 1);
            list.add(i, e);
        }

    }

}

