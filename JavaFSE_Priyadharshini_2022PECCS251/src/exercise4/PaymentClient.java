package exercise4;

public class PaymentClient {
    public static void main(String[] args) {
        System.out.println("Demonstrating Adapter Pattern for Payment Processing:\n");

        // Client code interacts with the Target Interface (PaymentProcessor)
        // It doesn't need to know the specific implementation details of the gateways.

        // Using Stripe Gateway via Adapter
        System.out.println("--- Using Stripe Gateway ---");
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        stripeProcessor.processPayment(100.50);
        // We can also call other Stripe-specific methods if the adapter exposed them or directly via the gateway object.
        stripeGateway.refund(10.00); // Example of directly accessing gateway if needed for other operations
        System.out.println("\n");


        // Using PayPal Gateway via Adapter
        System.out.println("--- Using PayPal Gateway ---");
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        payPalProcessor.processPayment(250.75);
        // Example of directly accessing gateway if needed for other operations
        payPalGateway.cancelPayment(20.00);
        System.out.println("\n");


        // Imagine a scenario where you have a list of payment processors
        System.out.println("--- Processing multiple payments through a unified interface ---");
        PaymentProcessor[] processors = new PaymentProcessor[] {
            new StripeAdapter(new StripeGateway()),
            new PayPalAdapter(new PayPalGateway())
        };

        for (PaymentProcessor processor : processors) {
            processor.processPayment(50.00);
        }
    }
}