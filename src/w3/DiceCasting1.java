package w3;

import java.util.Random;
import java.util.Scanner;

public class DiceCasting1 {

    public static void main(String[] args) {

        System.out.print("Seed: ");
        Scanner sc = new Scanner(System.in);
        long seed = sc.nextLong();
        Random random = new Random(seed);
        Dice dice = new Dice(random);
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }

    }
}
