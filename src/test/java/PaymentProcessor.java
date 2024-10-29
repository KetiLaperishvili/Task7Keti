interface PaymentProcessor {
    void process(double amount);
}


class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}


class PayPalProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}


public class PaymentService {
    public static void executePayment(PaymentProcessor paymentProcessor, double amount) {
        paymentProcessor.process(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardProcessor();
        PaymentProcessor payPal = new PayPalProcessor();

        executePayment(creditCard, 66);
        executePayment(payPal, 65);
    }
}