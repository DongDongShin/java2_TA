package w6.arraylist1;

public class ArrayIntList {


    private  static final int DEFAULT_CAPACITY = 10;
    private  int size;
    private  int[] element;

    public ArrayIntList(){

        element = new int[DEFAULT_CAPACITY];
        size = 0;

    }
    /**
     * 주어진 크기의 크기의 배열을 구성하고
     * size를 0으로 설정한다.
     * @param capacity 초기 용량 (0 이상이어야 함).
     */
    public ArrayIntList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity cannot be negative: " + capacity);
        }
        size = 0;
        element = new int[capacity];
    }

    public void add(int index,int value){//인덱스 안에 지정해서 넣어줌
        checkResize();

        for(int i = size;i>index;i--){//이 이후의 값들을 자기 전에 것을 참조해야함. 새로운 값이 추가가 되니깐. 그 앞에 인덱스가 그 전에 거를 가져야하고
            element[i] = element[i-1];
        }
        //넣어줘야지 해당 인덱스에 넣을 려면.. 그 전의 값이 뒤에 밀려야 함.
        element[index] = value;
        size++;//사이즈가 더해짐.

    }
    public void add(int value){
        element[size-1] = value;
    }

    public int get(int index){
        return element[index];
    }

    public void set(int index, int value){
        element[index] = value;
    }
    public boolean isEmpty(){
        if(element.length==0)
            return true;
        else return false;
    }

    public void remove(int index){
        for(int i = index;i<size-1;i++){
            element[i]= element[i+1];
        }
        size--;
    }

    public int size(){
        return element.length;
    }

    private void checkResize(){
        if(size == element.length){

        }
    }

    public String toString() {
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < size - 1; i++)
                sb.append(element[i] + ", ");
            sb.append(element[size - 1] + "");
            sb.append("]");
            return sb.toString();
        }
        else
            return "[]";
    }
}
