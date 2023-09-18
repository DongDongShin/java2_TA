package w3;

public class NumberedBankAccountTest {

    public static void main(String[] args) {


        NumberedBankAccount n1 = new NumberedBankAccount(1000.0);
        NumberedBankAccount n2 = new NumberedBankAccount();
        NumberedBankAccount n3 = new NumberedBankAccount();

        System.out.println("Account1: "+n1);
        System.out.println("Account2: "+n2);
        System.out.println("Account3: "+n3);
        System.out.println("Transfer 300.0won: account1 --> account2");
        n1.transfer(300.0,n2);
        System.out.println("Account1: "+n1);
        System.out.println("Account2: "+n2);
        System.out.println("Account3: "+n3);
    }
}
