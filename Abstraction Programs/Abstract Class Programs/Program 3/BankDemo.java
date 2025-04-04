abstract class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Concrete method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Abstract method (must be implemented)
    abstract void withdraw(double amount);

    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        account.checkBalance();
    }
}