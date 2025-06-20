package exercise4;

//Adaptee 1: Existing third-party payment gateway with its own interface
public class StripeGateway {
 public void charge(double amount) {
     System.out.println("Processing payment of $" + amount + " through Stripe Gateway.");
     // Simulate Stripe's specific charging logic
 }

 public void refund(double amount) {
     System.out.println("Initiating refund of $" + amount + " through Stripe Gateway.");
     // Simulate Stripe's specific refund logic
 }
}