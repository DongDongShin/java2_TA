package w8.generics;

import java.util.Arrays;

public class ArrayReverserTest {

    public static void main(String[] args) {

        Number[] a = new Number[5];
        a[0] = 1;
        a[1]= 2;
        a[2] = 3;
        a[3] = -1;
        a[4] = 3;
        System.out.println(Arrays.toString(a));

        ArrayReverser.reverse(a);
        System.out.println(Arrays.toString(a));
        System.out.println();

        // ArrayReverser.reverse 메소드를 이용하여
        // Double[]의 원소 순서를 바꿀 수 있는지 알아보는 코드를
        // 아래에 추가하세요.

        Double[] d = new Double[5];
        d[0] = 1.1;
        d[1] = 2.2;
        d[2] = 3.3;
        d[3] = -1.1;
        d[4] = 3.3;
        System.out.println(Arrays.toString(d));

        ArrayReverser.reverse(d);
        System.out.println(Arrays.toString(d));
        System.out.println();

        // <결과>
        // ArrayReverser.reverse 메소드를 이용하여
        // Double[]의 원소 순서를 바꿀 수 있다.
        // Double[]은 Number[]의 서브클래스이므로...

    }

}

