package w3;

public class VotingMachine2 {

    private int tteokbokki;
    private int sundae;


    public void vote(String pick){
        if(pick.equals("Tteokbokki"))
            tteokbokki++;
        else if(pick.equals("Sundae"))
            sundae++;
        else return;

    }


    public void clear() {
        tteokbokki = 0;
        sundae = 0;

    }

    public int getVotes(String pick){
        if(pick.equals("Tteokbokki"))
            return tteokbokki;
        else if(pick.equals("Sundae"))
            return sundae;
        else return 0;

    }


}
