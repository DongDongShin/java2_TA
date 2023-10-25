package w8.generics;

public class ArrayReverser {


    public static void reverse(Number[] array) {

        int size = array.length;
        Number temp;
        for (int i = 0; i < size / 2; i++) {//반만하는 거지..
            temp = array[i];//지금 인덱스를 가져와서
            array[i] = array[size -1 - i];//서로 스왑을 ㅐㅎ주고
            array[size -1 - i] = temp;//그냥 교환을 해주는 거자나
        }
    }
}
