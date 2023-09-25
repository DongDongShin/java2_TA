package w4;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RectangleTester2 {


    private void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seed: ");
        Long seed = sc.nextLong();
        Random random = new Random(seed);
        Rectangle[] arr = new Rectangle[3];
        ArrayList<Rectangle> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            double height = random.nextDouble()*100.0;
            double width = random.nextDouble()*100.0;
            Rectangle temp = new Rectangle(height,width);
            arr[i]= temp;
            list.add(temp);
        }
        System.out.println("Print the array using for-each loop.");
        for (Rectangle rectangle : arr) {
            System.out.println(rectangle);
        }
        System.out.println();
        System.out.println("Print the array list using for-each loop.");
        for (Rectangle rectangle : list) {
            System.out.println(rectangle);
        }
        System.out.println();
        System.out.println("Replace the first Rectangle in the ArrayList with a new Rectangle (5.0, 5.0).");
        System.out.println();
        list.set(0,new Rectangle(5.0,5.0));
        System.out.println("Print the array using for-each loop.");
        for (Rectangle rectangle : arr) {
            System.out.println(rectangle);
        }
        System.out.println();
        System.out.println("Print the array list using for-each loop.");
        for (Rectangle rectangle : list) {
            System.out.println(rectangle);
        }






    }
    public static void main(String[] args) {
        new RectangleTester2().test();

    }
}
