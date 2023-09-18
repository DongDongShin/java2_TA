package w3;

public class BalanceTester {

    String str;
    Counter counter;

    public BalanceTester(String str) {
        this.str = str;
        this.counter = new Counter();
    }

    public boolean balanced() {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(') counter.countUp();
            else if(str.charAt(i)==')') counter.countDown();
            else continue;

            if(counter.getValue()<0)
                return false;

        }

        int count = counter.getValue();
        counter.reset();
        if (count == 0) {
            return true;
        }
        else
            return  false;
    }
}
