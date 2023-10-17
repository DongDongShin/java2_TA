package w7.sortedlist1;


import java.util.Arrays;
import java.util.NoSuchElementException;

public class SortedIntList extends ArrayIntList {

    private boolean unique;

    public SortedIntList() {
        super();
        unique = false; //일단 중복을 허용 노


    }
    public SortedIntList(int capacity) {//요량을 지정
        super(capacity);
        unique = false; //일단 중복을 허용 노
    }
    public SortedIntList(boolean unique) {
        super();
        this.unique = unique;
    }
    public SortedIntList(boolean unique,int capacity) {
        super(capacity);
        this.unique = unique;
    }


    @Override
    public void add(int value) {
        int index = Arrays.binarySearch(element,0,size, value);// 적당한 인덱스를 찾음 얘가 들어갈 얘
        if(index >=0){
            super.add(index,value);
        }
        else { //없으면 원래 있어야 할 자리에 -를하고 1을 빼줌...
            super.add(-(index+1),value);

        }
    }

    @Override
    public int indexOf(int value) {
        int index = Arrays.binarySearch(element,0,size,value);
        if (index >= 0) {
            return  index;
        }
        else return -1;
    }

    public int max() {
        if (size == 0) {
          throw new NoSuchElementException();
        }
        else return element[size-1];

    }

    public int min(){
        if (size == 0) {
            throw new NoSuchElementException();
        }
        else return element[0];

    }
    @Override
    public String toString(){
        return super.toString();
    }
}
