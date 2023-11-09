package tema8.BankAccount;

public abstract class BankAccount {
    public double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);


}
