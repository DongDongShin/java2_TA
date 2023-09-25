package w4;

import java.util.*;

public class AsListTest {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seed: ");
        Long seed = sc.nextLong();
        Random random = new Random(seed);

        List<Integer> list = Arrays.asList(random.nextInt(),random.nextInt(),random.nextInt(),random.nextInt(),random.nextInt());

        System.out.println("List.");
        System.out.println(list);
        System.out.println();
        System.out.println("List sorted in Natural ordering.");
        Collections.sort(list);
        System.out.println(list);
        System.out.println();

        System.out.println("List sorted bv the absolute values.");
        Collections.sort(list,new AbsoluteValueComparator());
        System.out.println(list);


    }


}

class  AbsoluteValueComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(Math.abs(o1) ==Math.abs(o2)) return 0;
        else if(Math.abs(o2)>Math.abs(o1)) return -1;
        else return 1;
    }
}
