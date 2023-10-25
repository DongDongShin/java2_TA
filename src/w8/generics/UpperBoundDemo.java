package w8.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundDemo {


    public static void main(String[] args) {
        List<Number> ln = new ArrayList<>();
        ln.add(1);
        ln.add(5.3);
        ln.add(1.1f);
        System.out.println(ln);

        List<Number> ln2 = new ArrayList<>();
        //List<Number> ln2 = new ArrayList<Double>(); 이러면 안된느 거임 서브타입이 아니기 때문ㅇ[

        ln2.add(10);
        ln2.add(100.3);
        ln.addAll(ln2);
        System.out.println(ln);

        List<Integer> li = new ArrayList<>();
        li.add(-1);
        li.add(-100);
        ln.addAll(li);
        System.out.println(ln);
    }
}
