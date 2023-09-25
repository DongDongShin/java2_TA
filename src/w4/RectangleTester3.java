package w4;



import java.util.*;

public class RectangleTester3 {


    private void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seed: ");
        Long seed = sc.nextLong();
        Random random = new Random(seed);
        Rectangle3[] arr = new Rectangle3[3];
        ArrayList<Rectangle3> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            double height = random.nextDouble()*100.0;
            double width = random.nextDouble()*100.0;
            Rectangle3 temp = new Rectangle3(height,width);
            arr[i]= temp;
            list.add(temp);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println();

        System.out.println("Sort by area (natural ordering)");
        Arrays.sort(arr);
        Collections.sort(list);

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println();
        System.out.println("Sort by diagonal length");
        Arrays.sort(arr, new DiagonalComparator());
        Collections.sort(list,new DiagonalComparator());
        System.out.println(Arrays.toString(arr));
        System.out.println(list);








    }
    public static void main(String[] args) {
        new RectangleTester3().test();

    }
}
