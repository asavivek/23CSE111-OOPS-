// Bank Account System using Single Inheritance

// Parent class: Basic bank account
class BankAccount {
    private String accountNumber;
    protected double balance;  // protected to allow access in child class
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }
    
    public void checkBalance() {
        System.out.println("Account " + accountNumber + " balance: ₹" + balance);
    }
}

// Child class: Savings account with interest
class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);  // calling parent constructor
        this.interestRate = interestRate;
    }
    
    public void applyInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied: ₹" + interest);
    }
    
    // Modified withdraw method to add minimum balance requirement
    public void withdraw(double amount) {
        if (balance - amount < 1000) {  // maintaining minimum balance of ₹1000
            System.out.println("Withdrawal failed. Minimum balance requirement not met.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        // Create a savings account
        SavingsAccount mySavings = new SavingsAccount("SA123456", 5000, 3.5);
        
        // Using inherited methods
        mySavings.checkBalance();
        mySavings.deposit(2000);
        mySavings.withdraw(1000);
        
        // Using child class specific method
        mySavings.applyInterest();
        
        // Trying to withdraw below minimum balance
        mySavings.withdraw(6000);  // This will be prevented
        
        mySavings.checkBalance();
    }
}