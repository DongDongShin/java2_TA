package w3;

import java.util.Scanner;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int value) {
        this.value = value;
    }

    public void countUp() {
        value++;
    }



    public void countDown() {
        value--;
    }

    public void reset() {
        value=0;
    }

    public int getValue() {
        return value;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Counter c1 = new Counter();
        int i;
        System.out.println("counting positive and negative integers.");
        while (true) {
            System.out.print("Enter an integer: ");
            i = sc.nextInt();
            if(i==0) break;
            else if (i >= 0) {
                c1.countUp();
            }
            else {
                c1.countDown();
            }

        }
        System.out.println("Number of positive integers - number of negative integers = "+c1.getValue());



    }
}
