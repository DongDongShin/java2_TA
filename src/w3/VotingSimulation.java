package w3;

import java.util.Random;
import java.util.Scanner;

public class VotingSimulation {

    public static void main(String[] args) {
        System.out.println("Seed: ");
        Scanner sc = new Scanner(System.in);
        long seed = sc.nextLong();
        Random random = new Random(seed);

        VotingMachine votingMachine = new VotingMachine();

        for (int i = 0; i < 1000; i++) {
            if (random.nextBoolean()) {
                votingMachine.voteForSun();
            }
            else
                votingMachine.voteForTkeokk();
        }

        System.out.println("Sundae: "+votingMachine.getSunVotes());
        System.out.println("Tteokbokki: "+votingMachine.getTkeokkVotes());
        sc.close();
    }
}
