package tema8.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(500.0);
        BankAccount currentAccount = new DepositAccount(1000.0);

        savingsAccount.deposit(200.0);
        savingsAccount.withdraw(50.0);
        savingsAccount.withdraw(300.0);

        currentAccount.deposit(300.0);
        currentAccount.withdraw(1200.0);
        currentAccount.withdraw(800.0);
    }
    }

