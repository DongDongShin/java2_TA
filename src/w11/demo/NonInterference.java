package w11.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class NonInterference {

    // Non-interference
    // 스트림파이프라인 연산이 진행되는 동안 스트림 소스를 변경하면 안된다.

    // 터미널연산이 시작될 때까지는 파이프라인 연산이 수행되지 않으므로 (lazy operation)
    // 터미널연산이 시작되기 전에는 소스를 변경할 수 있다.
    public static void main(String[] args) {

        List<String> l = new ArrayList<>(Arrays.asList("one", "two"));
        Stream<String> sl = l.stream();
        l.add("three");
        String s = sl.collect(joining(" "));//최종연산이 진행되기 전에는 중간 연산이 실행되지 않기 때문에. three가 추가되어도 괜찮다.
        System.out.println(s);

        String out = l.stream().peek(e -> { ///스트림 연산이 실행되는 동안에는 데이터 소스가 변경되어서는 안된다.
                    if("one".equals(e))
                        l.add("three");
                }
        ).collect(joining(" "));
        System.out.println(out);


    }

}