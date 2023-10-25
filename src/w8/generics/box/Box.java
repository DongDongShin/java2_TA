package w8.generics.box;

public class Box<T>{

    private T t;

    public Box(T t) {
        this.t = t;
    }
    public T getContents(){
        return t;

    }

    public void setContents(T t1){
        this.t = t1;
    }
}
