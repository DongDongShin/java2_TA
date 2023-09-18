package w3;

import java.util.Scanner;

public class BalanceTesterDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check balance: ");
        String s = sc.nextLine();
        BalanceTester balanceTester = new BalanceTester(s);
        if(balanceTester.balanced())
            System.out.println("괄호짝이 맞습니다.");
        else
            System.out.println("괄호짝이 맞지 않습니다.");
    }
}
