package w3;

import java.util.Random;
import java.util.Scanner;

public class DiceCasting2 {
    public static void main(String[] args) {
        int[] cnt = new int[12];
        System.out.print("Seed: ");
        Scanner sc = new Scanner(System.in);
        long seed = sc.nextLong();
        Random random = new Random(seed);
        Dice dice = new Dice(random);
        for (int i = 0; i < 1000; i++) {

            int temp = dice.roll();
            cnt[temp-1]++;
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(i+1+":\t"+cnt[i]);
        }
    }


}
