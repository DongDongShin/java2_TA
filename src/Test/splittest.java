package Test;

public class splittest {


    public static void main(String[] args) {


        String a = "foooof"; //앞뒤에 구분되는 글자가 있을 경우
        String[] a_arr = a.split("o");
        String b = "oooof"; //뒤에 구분되는 글자가 있을 경우
        String[] b_arr = b.split("o");
        String c = "foooo"; //앞에 구분되는 글자가 있을 경우
        String[] c_arr = c.split("o");







    }
}
