package w3;

import java.util.Random;
import java.util.Scanner;

public class LottoGeneratorTest {


    public static void main(String[] args) {
        int[] numbers;

        System.out.print("Seed: ");
        Scanner sc = new Scanner(System.in);
        long seed = sc.nextLong();
        Random random = new Random(seed);

        LottoGenerator generator = new LottoGenerator(random);

        for (int n = 0; n < 10; n++) {
            int[] temp =generator.generateNumbers();
            for (int i : temp) {
                System.out.print(i+" ");

            }
            System.out.println();


        }

    }
}
