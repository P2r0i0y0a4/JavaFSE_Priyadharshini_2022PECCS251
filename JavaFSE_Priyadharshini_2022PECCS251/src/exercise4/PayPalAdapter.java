package exercise4;

//Adapter 2: Adapts PayPalGateway to the PaymentProcessor interface
public class PayPalAdapter implements PaymentProcessor {
 private PayPalGateway payPalGateway;

 public PayPalAdapter(PayPalGateway payPalGateway) {
     this.payPalGateway = payPalGateway;
 }

 @Override
 public void processPayment(double amount) {
     // Translate the processPayment call to PayPalGateway's makePayment method
     payPalGateway.makePayment(amount);
 }
}