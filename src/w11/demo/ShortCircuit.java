package w11.demo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ShortCircuit {
    public static void main(String[] args) {

        // 무한히 긴 짝수 스트림.
        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);

        // Short-circuiting에 의한 연산 제한.
        evenNumInfiniteStream.limit(10).forEach(x -> System.out.printf(x + " "));//0 2 ....4 8 10 12 14 16 18
        System.out.println();

        IntStream.of(1, 2, 3, 4, 5)
                .skip(2) //3부터 출력하고
                .limit(2)//얘로 인해서 두번만 일할꺼를 생각하게해
                .forEach(System.out::println);
    }
    //
}

