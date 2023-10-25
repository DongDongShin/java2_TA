package w8.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceAllDemo {


    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,-1,3);
        System.out.println("List<Integer>: "+li);
        System.out.println("Replace all 3's with 30.");
        Collections.replaceAll(li,3,30);
        System.out.println(li);

        List<Float> lf = Arrays.asList(1.0f, 2.0f, 3.0f, -1.0f, 3.0f);
        System.out.println("List<Float>: " + lf);
        System.out.println("Replace all 3.0's with 30.0.");
        Collections.replaceAll(lf, 3.0f, 30.0f);	// T는 Float
        System.out.println(lf);
        System.out.println();

        List<String> ls = Arrays.asList("Sping", "Summer", "Fall", "Winter", "Spring", "Spring");
        System.out.println("List<String> " + ls);
        System.out.println("Replace all \"Spring\"s with \"Summer\"."); //이거를 해줍시다...
        Collections.replaceAll(ls, "Spring", "Summer");	// T는 String
        System.out.println(ls);
        System.out.println();

    }
}
