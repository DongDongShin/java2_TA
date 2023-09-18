package w3;

import java.util.Random;
import java.util.Scanner;

public class VotingSimulation2 {

    public static void main(String[] args) {
        System.out.println("Seed: ");
        Scanner sc = new Scanner(System.in);
        long seed = sc.nextLong();
        Random random = new Random(seed);

        VotingMachine2 votingMachine = new VotingMachine2();

        for (int i = 0; i < 1000; i++) {
            if (random.nextBoolean()) {
                votingMachine.vote("Sundae");
            }
            else
                votingMachine.vote("Tteokbokki");
        }

        System.out.println("Sundae: "+votingMachine.getVotes("Sundae"));
        System.out.println("Tteokbokki: "+votingMachine.getVotes("Tteokbokki"));
        sc.close();
    }
}
