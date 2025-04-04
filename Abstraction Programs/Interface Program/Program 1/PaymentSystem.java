interface PaymentGateway {
    void processPayment(double amount);
    void refund(double amount);
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment: $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to Credit Card");
    }
}

class UPIPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment: ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " via UPI");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentGateway creditCard = new CreditCardPayment();
        PaymentGateway upi = new UPIPayment();

        creditCard.processPayment(100.50);
        upi.processPayment(500);
        
        creditCard.refund(20.25);
    }
}