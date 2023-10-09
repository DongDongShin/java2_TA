package w6.arraylist2;

public class useList1 {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        for(int i =0;i<10;i++){
            list.add(0,i);
        }

        System.out.println(list);


    }
}
