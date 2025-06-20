package exercise8;
//Concrete Strategy 1: Implements the algorithm using a credit card.
public class CreditCardPayment implements PaymentStrategy {
 private String cardNumber;
 private String nameOnCard;
 private String cvv;
 private String expirationDate;

 public CreditCardPayment(String cardNumber, String nameOnCard, String cvv, String expirationDate) {
     this.cardNumber = cardNumber;
     this.nameOnCard = nameOnCard;
     this.cvv = cvv;
     this.expirationDate = expirationDate;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Paying $" + amount + " using Credit Card.");
     System.out.println("Card Number: " + cardNumber + ", Name: " + nameOnCard);
     // In a real system, integrate with a credit card processing API here
 }
}