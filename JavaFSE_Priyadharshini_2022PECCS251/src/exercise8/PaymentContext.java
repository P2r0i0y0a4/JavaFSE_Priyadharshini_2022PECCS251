package exercise8;

//Context Class: Holds a reference to a Strategy object and delegates the execution to it.
public class PaymentContext {
 private PaymentStrategy paymentStrategy;

 public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 public void executePayment(double amount) {
     if (paymentStrategy == null) {
         System.out.println("Error: No payment strategy set.");
         return;
     }
     System.out.println("Initiating payment...");
     paymentStrategy.pay(amount); // Delegate the actual payment logic to the selected strategy
     System.out.println("Payment process complete.\n");
 }
}