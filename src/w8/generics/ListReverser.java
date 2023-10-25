package w8.generics;

import java.util.List;

public class ListReverser {

    public static void reverse(List<Number> list) {
        int size = list.size();

        //배열을 거꾸로 하는 방법
        for(int i=0;i<size-1;i++){ //-1을 하는 이유 size까지 하게 되면 1이 맨뒤에 있는 상태에서 또 뒤로 감..
            Number temp=list.remove(size-1);//맨 뒤의 값을 처음부터 다시 넣어주면되지
            list.add(i,temp);
        }
    }
}
