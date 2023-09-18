package w3;

public class NumberedBankAccount {
    private int accountNumber;

    private double balance;
    private  static int nextAccountNumber = 100;

    public NumberedBankAccount(double initialBalance) {
        this.balance = initialBalance;
        accountNumber = ++nextAccountNumber;
    }

    public NumberedBankAccount() {

        balance = 0.0;
        accountNumber = ++nextAccountNumber;

    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return  balance;
    }

    public int getAccountNumber() {
        return  accountNumber;
    }
    @Override
    public String toString() {

        return "NumberedBanksAccount[accountNumber="+this.accountNumber+",balance="+this.balance+"]";
    }

    public void transfer(double amount, NumberedBankAccount other) {
        this.withdraw(amount);
        other.deposit(amount);
    }
}
