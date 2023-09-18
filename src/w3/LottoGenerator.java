package w3;

import java.util.Random;

public class LottoGenerator {
    private Random random;


    public LottoGenerator(Random generator) {
        this.random = generator;
    }

    public int[] generateNumbers() {
        int[] LottoNumbers = new int[6];
        for (int i = 0; i < LottoNumbers.length; i++) {
            LottoNumbers[i]= random.nextInt(50);
        }

        return LottoNumbers;

    }



}
