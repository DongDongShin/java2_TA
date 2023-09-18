package w2;

public class CounterTest {


    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.setCount(8);

        counter.tick();
        System.out.println("Count = "+ counter.getCount());
        counter.tick();
        System.out.println("Count = "+ counter.getCount());
        counter.tick();
        System.out.println("Count = "+ counter.getCount());
        counter.tick();
        System.out.println("Count = "+ counter.getCount());
        System.out.println();

        counter.setCount(12);
        System.out.println("Try to set counter to 12");
        System.out.println("Count = "+ counter.getCount());

        counter.setCount(5);
        System.out.println("Try to set counter to 5");
        System.out.println("Count = "+ counter.getCount());

    }
}
