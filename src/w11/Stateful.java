package w11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class Stateful {

    static  int cnt=0;
    static void statefullLambda() {
        Set<Integer> s = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> list = new ArrayList<>();


        //s.parallelStream().forEach(number -> System.out.println(number+" "+Thread.currentThread().getName()));
//        int sum = s.parallelStream().mapToInt(e -> {
//            if (list.size() <= 3) {
//                System.out.println(cnt+" "+"현재"+" "+e+" "+Thread.currentThread().getName());
//                list.add(e);
//                System.out.println(cnt+" "+"list.size="+" "+list.size()+" "+Thread.currentThread().getName());
//                System.out.println(cnt+" "+"-------------------------"+" "+Thread.currentThread().getName());
//
//                cnt++;
//                return e;
//            } else
//                return 0;
//        }).sum();
//        System.out.println(sum + " ");
//        System.out.println(list);
//        cnt=0;
        int sum = s.parallelStream().mapToInt(e -> {
            if (list.size() <= 3) {
                list.add(e);
                return e;
            } else
                return 0;
        }).sum();
        System.out.print(sum + " ");

    }

    static void statefullLambda2() {
        Set<Integer> seen = Collections.synchronizedSet(new HashSet<>());//동시에 접근할 수가 없음.
        IntStream stream = new Random().ints(10, 0, 10);// 0~10까지의 난수 스트림.
        int sum = stream.parallel().map(e -> {
            if (seen.add(e))
            {
                //System.out.println(e);//동시에 접근되지 않을때,
                return 0;
            }

            else
            {
                System.out.println("*"+e);

                return e;//그게 아니면 e를 반환.

            }
        }).sum();

        System.out.println("sum= "+sum + " ");

    }
//
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            statefullLambda();
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++)
            statefullLambda2();
    }
}