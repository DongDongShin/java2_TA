package w4;

public class BankAccount implements  Measurable {

    private  double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double amount) {
        balance-=amount;
    }

    public double getBalance() {
        return  balance;
    }

    public String toString() {
        return String.format("BankAccount[balance = %,.1f]", balance);
    }

    @Override
    public double getMeasure() {
        return balance;
    }
}
