package w2;

import java.util.Scanner;

public class RemoconTest {
    public static void main(String[] args) {
        Remocon remocon = new Remocon();

        Scanner input = new Scanner(System.in);

        remocon.display();

        boolean end = false;
        int selection = 0;
        while (!end) {
            System.out.println("1: volume up.");
            System.out.println("2: volume down.");
            System.out.println("3: channel up.");
            System.out.println("4: channel down.");
            System.out.println("0: End.");
            System.out.println("Select: ");

            selection = input.nextInt();
            switch (selection) {
                case 1:
                    remocon.volumeUp();
                    break;

                case 2:
                    remocon.volumeDown();
                    break;
                case 3:
                    remocon.channelUp();
                    break;

                case 4:
                    remocon.channelDown();
                    break;
                default:
                    System.out.println("Power off.");
                    end = true;
            }

        }
        input.close();
    }
}
