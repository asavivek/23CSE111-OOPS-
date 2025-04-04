// Interface for transactions
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

// Parent class for all accounts
class Account {
    protected double balance;
    protected String accountNumber;

    Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    void displayBalance() {
        System.out.println("Account " + accountNumber + " Balance: $" + balance);
    }
}

// Child class inheriting from Account and implementing Transaction
class SavingsAccount extends Account implements Transaction {
    private double interestRate;

    SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Savings Account");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}

// Another child class inheriting from Account
class CurrentAccount extends Account {
    private double overdraftLimit;

    CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    void checkOverdraft() {
        System.out.println("Overdraft Limit for " + accountNumber + ": $" + overdraftLimit);
    }
}

// Main class to test the banking system
public class BankingSystem {
    public static void main(String[] args) {
        // Create a savings account
        SavingsAccount savings = new SavingsAccount("SAV123", 1000.0, 5.0);
        savings.deposit(500.0);
        savings.addInterest();
        savings.withdraw(200.0);
        savings.displayBalance();

        System.out.println();

        // Create a current account
        CurrentAccount current = new CurrentAccount("CUR456", 2000.0, 1000.0);
        current.displayBalance();
        current.checkOverdraft();
    }
}