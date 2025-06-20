package exercise8;

public class PaymentProcessorDemo {
    public static void main(String[] args) {
        System.out.println("Demonstrating Strategy Pattern for Payment System:\n");

        // Create the Context
        PaymentContext context = new PaymentContext();

        // Scenario 1: Pay using Credit Card
        System.out.println("--- Scenario 1: Payment via Credit Card ---");
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "John Doe", "123", "12/25");
        context.setPaymentStrategy(creditCard);
        context.executePayment(150.75);

        // Scenario 2: Pay using PayPal
        System.out.println("--- Scenario 2: Payment via PayPal ---");
        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com", "mysecretpaypalpwd"); // Dummy password
        context.setPaymentStrategy(payPal);
        context.executePayment(89.99);

        // Scenario 3: Change strategy and pay again with Credit Card
        System.out.println("--- Scenario 3: Another payment via Credit Card ---");
        // No need to create a new CreditCardPayment object if we use the same details
        context.setPaymentStrategy(creditCard);
        context.executePayment(300.00);

        // Scenario 4: Attempt to pay without setting a strategy
        System.out.println("--- Scenario 4: No payment strategy set ---");
        PaymentContext noStrategyContext = new PaymentContext();
        noStrategyContext.executePayment(50.00);
    }
}