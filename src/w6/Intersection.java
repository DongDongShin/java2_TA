package w6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intersection {

    public static List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
        List<Integer> intersections = new ArrayList<>();
        for (Integer temp : list1) {
            for (Integer temp2 : list2) {
                if(temp==temp2) intersections.add(temp);
            }
        }

        return intersections;

    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("n1 and n2: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            list1.add(2 * i);
        }
        for (int i = 0; i < n2; i++) {
            list2.add(3*i);
        }

        List<Integer> intersection = intersection(list1,list2);
        System.out.println(intersection);
    }
}
