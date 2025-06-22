package exercise8;

public class Readme {

/*
 * Project Structure:

StrategyPatternExample
├── src
│   └── com
│       └── paymentsystem
│           ├── PaymentStrategy.java
│           ├── CreditCardPayment.java
│           ├── PayPalPayment.java
│           ├── PaymentContext.java
│           └── PaymentProcessorDemo.java
Code Implementation:

1. Define Strategy Interface:

src/com/paymentsystem/PaymentStrategy.java

2. Implement Concrete Strategies:

src/com/paymentsystem/CreditCardPayment.java

3. Implement Context Class:

src/com/paymentsystem/PaymentContext.java

4. Test the Strategy Implementation:

src/com/paymentsystem/PaymentProcessorDemo.java

Output:

Demonstrating Strategy Pattern for Payment System:

--- Scenario 1: Payment via Credit Card ---
Initiating payment...
Paying $150.75 using Credit Card.
Card Number: 1234-5678-9012-3456, Name: John Doe
Payment process complete.

--- Scenario 2: Payment via PayPal ---
Initiating payment...
Paying $89.99 using PayPal.
PayPal Email: john.doe@example.com
Payment process complete.

--- Scenario 3: Another payment via Credit Card ---
Initiating payment...
Paying $300.0 using Credit Card.
Card Number: 1234-5678-9012-3456, Name: John Doe
Payment process complete.

--- Scenario 4: No payment strategy set ---
Initiating payment...
Error: No payment strategy set.
Payment process complete.
Explanation of the Strategy Pattern in this example:

Strategy Interface (PaymentStrategy):

Defines the common interface for all the algorithms (payment methods). It declares the pay() method that all concrete strategies must implement.
Concrete Strategies (CreditCardPayment, PayPalPayment):

Each concrete strategy implements the PaymentStrategy interface and provides its own specific algorithm for payment.
They encapsulate the details of how to perform a credit card payment or a PayPal payment.
Context Class (PaymentContext):

Holds a reference to a PaymentStrategy object.
It has a setPaymentStrategy() method to allow clients to dynamically set or change the strategy at runtime.
The executePayment() method delegates the actual payment logic to the currently set PaymentStrategy object by calling its pay() method. The PaymentContext itself doesn't know how the payment is processed, only that it will be processed according to the chosen strategy.
Benefits of using the Strategy Pattern here:

Runtime Algorithm Selection: You can choose the payment method at runtime, based on user input or other conditions, without modifying the PaymentContext class.
Encapsulation of Algorithms: Each payment method is encapsulated in its own class, keeping the code clean and organized.
Easily Extendable: Adding a new payment method (e.g., Google Pay, Bank Transfer) is as simple as creating a new class that implements PaymentStrategy. You don't need to change existing code.
Eliminates Conditional Logic: Avoids large if-else or switch statements in the PaymentContext that would otherwise be needed to select the payment algorithm.
Improved Testability: Each strategy can be tested independently.


 */
}
