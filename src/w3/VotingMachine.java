package w3;

public class VotingMachine {

    private int tteokbokki;
    private int sundae;

    public void voteForTkeokk() {
        tteokbokki++;
    }

    public void voteForSun() {
        sundae++;
    }

    public void clear() {
        tteokbokki = 0;
        sundae = 0;

    }

    public int getTkeokkVotes() {
        return  tteokbokki;

    }

    public int getSunVotes() {
        return  sundae;
    }
}
