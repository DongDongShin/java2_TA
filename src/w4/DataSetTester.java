package w4;


import java.util.Random;
import java.util.Scanner;

public class DataSetTester {

    void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seed: ");
        Long seed = sc.nextLong();
        Random random = new Random(seed);
        DataSet dataSet = new DataSet();
        DataSet dataSet2 = new DataSet();


        for(int i =0;i<100;i++){
            double height = random.nextDouble()*100.0;
            double width = random.nextDouble()*100.0;
            Rectangle2 temp = new Rectangle2(height,width);
            dataSet.add(temp);
        }
        System.out.println("Rectangle2 with the largest area: "+dataSet.getMaximum());
        System.out.println("The Largest area: "+String.format("%,.1f",dataSet.getMaximum().getMeasure()));
        System.out.println("Average area: "+String.format("%,.1f",dataSet.getAverage()));
        System.out.println();
        for(int i =0;i<100;i++){
            double balance = random.nextDouble()*10000.0;
            BankAccount bankAccount = new BankAccount(balance);
            dataSet2.add(bankAccount);

        }
        System.out.println("BankAccount with the largest balance: "+dataSet2.getMaximum());
        System.out.println("BankAccount with the smallest balance: "+dataSet2.getMinimum());
        System.out.println("Average balance: "+String.format("%,.1f",dataSet2.getAverage()));


    }

    public static void main(String[] args) {
        new DataSetTester().test();

    }
}
