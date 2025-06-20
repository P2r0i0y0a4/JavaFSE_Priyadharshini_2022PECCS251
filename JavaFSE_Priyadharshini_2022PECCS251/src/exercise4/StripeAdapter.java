package exercise4;
//Adapter 1: Adapts StripeGateway to the PaymentProcessor interface
public class StripeAdapter implements PaymentProcessor {
 private StripeGateway stripeGateway;

 public StripeAdapter(StripeGateway stripeGateway) {
     this.stripeGateway = stripeGateway;
 }

 @Override
 public void processPayment(double amount) {
     // Translate the processPayment call to StripeGateway's charge method
     stripeGateway.charge(amount);
 }
}