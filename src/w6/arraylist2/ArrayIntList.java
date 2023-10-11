package w6.arraylist2;
import java.util.Arrays;

public class ArrayIntList {

    public static void main(String[] args) { }

    private static final int DEFAULT_CAPACITY = 10;

    // fields
    private int size;
    private int[] element;

    /**
     * DEFAULT_CAPACITY 크기의 배열을 구성하고
     * size를 0으로 설정한다.
     */
    public ArrayIntList() {
        size = 0;
        element = new int[DEFAULT_CAPACITY];
    }


    public ArrayIntList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity cannot be negative: " + capacity);
        }
        size = 0;
        element = new int[capacity];
    }


    public void add(int value) {
        add(size, value);
    }



    public void add(int index, int value) {
        checkIndex(index, 0, size);
        checkResize();


        for (int i = size; i > index; i--) {
            element[i] = element[i - 1];
        }


        element[index] = value;
        size++;

    }


    public int get(int index) {
        checkIndex(index, 0, size - 1);


        return element[index];
    }


    public void set(int index, int value) {

        checkIndex(index, 0, size - 1);

        element[index] = value;
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public void remove(int index) {

        checkIndex(index, 0, size - 1);


        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        size--;
    }


    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (element[i] == value) {
                return i;
            }
        }
        return -1;   // not found
    }


    public boolean contains(int value) {
        return indexOf(value) >= 0;
    }

    public String toString() {
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < size - 1; i++)
                sb.append(element[i] + ", ");
            sb.append(element[size - 1] + "");
            sb.append("]");
            return sb.toString();
        }
        else
            return "[]";
    }


    private void checkResize() {

        if (size == element.length) {
            element = Arrays.copyOf(element, 2 * size);
        }
    }


    private void checkIndex(int index, int min, int max) {
        if (index < min || index > max) {
            throw new ArrayIndexOutOfBoundsException("Wrong index: " + index);
        }
    }
}

