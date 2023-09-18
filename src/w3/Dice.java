package w3;

import java.util.Random;

public class Dice {
    private Die die1;
    private Die die2;

    public Dice(Random r) {
        this.die1 = new Die(r);
        this.die2 = new Die(r);
    }

    public int roll() {
        return die1.roll()+die2.roll();
    }
}
