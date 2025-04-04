class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Default interest calculation (5%)
    public double calculateInterest() {
        return balance * 0.05;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    // Override: Higher interest for savings (7%)
    @Override
    public double calculateInterest() {
        return balance * 0.07;
    }
}

class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(double balance) {
        super(balance);
    }

    // Override: Highest interest for fixed deposits (9%)
    @Override
    public double calculateInterest() {
        return balance * 0.09;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount regular = new BankAccount(10000);
        BankAccount savings = new SavingsAccount(10000);
        BankAccount fixedDeposit = new FixedDepositAccount(10000);

        System.out.println("Regular Account Interest: $" + regular.calculateInterest());
        System.out.println("Savings Account Interest: $" + savings.calculateInterest());
        System.out.println("Fixed Deposit Interest: $" + fixedDeposit.calculateInterest());
    }
}