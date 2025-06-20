package exercise4;

//Adaptee 2: Another existing third-party payment gateway with a different interface
public class PayPalGateway {
 public void makePayment(double total) {
     System.out.println("Executing payment of $" + total + " via PayPal Gateway.");
     // Simulate PayPal's specific payment execution logic
 }

 public void cancelPayment(double total) {
     System.out.println("Cancelling payment of $" + total + " via PayPal Gateway.");
     // Simulate PayPal's specific payment cancellation logic
 }
}