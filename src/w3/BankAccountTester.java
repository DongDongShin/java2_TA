package w3;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount(1000.0);

        bankAccount1.deposit(500.0);
        bankAccount2.deposit(500.0);

        bankAccount1.withdraw(100.0);
        bankAccount2.withdraw(100.0);

        System.out.println("Balance of the first account = "+bankAccount1.getBalance());
        System.out.println("Balance of the second account = "+ bankAccount2.getBalance());
    }
}
