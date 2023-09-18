package w3;

import java.util.Random;
import java.util.Scanner;

public class LottoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        Long seed = sc.nextLong();
        Random r = new Random(seed);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(50);
        }



        System.out.print("Seed: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }



    }
}
