package w3;

public class Reverser {

    private String s;

    public Reverser(String s) {
        this.s = s;
    }

    public String reverse() {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));

        }
        return sb.toString();
    }

    public String reverseWords() {
        String[] sarr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = sarr.length-1; i >=0;i--) {
            for (int j = 0; j < sarr[i].length(); j++) {
                sb.append(sarr[i].charAt(j));
            }
            sb.append(" ");

        }
        return sb.toString();
    }
}
