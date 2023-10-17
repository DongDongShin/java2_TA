package w7.stutterlist;

import java.util.HashMap;
import java.util.Map;



public class StutterIntList extends ArrayIntList {	// ArrayIntList의 서브클래스로 선언!
    private int stretch;

    public StutterIntList(int stretch, int capacity) {
        super(capacity);	// ArrayIntList 클래스의 생성자를 호출함.

        if (stretch < 0) {
            throw new IllegalArgumentException("Stretch factor cannot be negative: " + stretch);
            // 예외를 던지면 아래 문장으로 내려가지 않고, 예외처리기로 감!
        }
        this.stretch = stretch;	// 이 클래스에서 추가로 선언한 필드를 초기화함.
    }
    public StutterIntList(int stretch) {
        super();

        this.stretch = stretch;
    }

    public void setStretch(int stretch) {
        this.stretch = stretch;
    }

    public int getStretch() {
        return stretch;
    }

    public int count(int value) {
        int number = 0;
        for (int i = 0; i < size; i++) {
            if (element[i] == value) {
                number++;
            }
        }
        return number;
    }

    @Override
    public void add(int index, int value){
        for(int i =1;i <=stretch;i++){ //엎어쓰기..
            super.add(index,value);
        }
    }
    public Map<Integer, Integer> counts() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(element[i], map.getOrDefault(element[i],  0) + 1);
        }
        return map;
    }



}
