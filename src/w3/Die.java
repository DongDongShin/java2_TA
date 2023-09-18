package w3;

import java.util.Random;

public class Die {
    public  final int MAX =6;
    Random random;

    public Die(Random r) {
        this.random = r;
    }

    public int roll() {

        return random.nextInt(6)+1;
    }
}
