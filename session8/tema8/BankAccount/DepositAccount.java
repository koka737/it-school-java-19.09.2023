package tema8.BankAccount;

import tema8.BankAccount.BankAccount;

public class DepositAccount extends BankAccount {
    public DepositAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient balance to withdraw $" + amount);
        }
    }
}
