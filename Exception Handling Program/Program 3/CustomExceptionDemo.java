// Custom exception class
class InsufficientFundsException extends Exception {
    private double amount;
    
    public InsufficientFundsException(double amount) {
        super("Insufficient funds: " + amount);
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }
}

class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        
        try {
            System.out.println("Current balance: 1000");
            System.out.println("Withdrawing 600...");
            account.withdraw(600);
            
            System.out.println("\nWithdrawing 500...");
            account.withdraw(500);
            
            System.out.println("\nWithdrawing 200...");
            account.withdraw(200); // This will throw the custom exception
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("You need $" + e.getAmount() + " more to complete this transaction.");
        }
    }
}