package exercise4;

public class Readme {

/*
 * Project Structure:

AdapterPatternExample
├── src
│   └── com
│       └── payment
│           ├── PaymentProcessor.java
│           ├── StripeGateway.java
│           ├── PayPalGateway.java
│           ├── StripeAdapter.java
│           ├── PayPalAdapter.java
│           └── PaymentClient.java
Code Implementation:

1. Define Target Interface:

src/com/payment/PaymentProcessor.java

2. Implement Adaptee Classes:

src/com/payment/StripeGateway.java

3. Implement the Adapter Class:

src/com/payment/StripeAdapter.java

4. Test the Adapter Implementation:

src/com/payment/PaymentClient.java

Output:

Demonstrating Adapter Pattern for Payment Processing:

--- Using Stripe Gateway ---
Processing payment of $100.5 through Stripe Gateway.
Initiating refund of $10.0 through Stripe Gateway.


--- Using PayPal Gateway ---
Executing payment of $250.75 via PayPal Gateway.
Cancelling payment of $20.0 via PayPal Gateway.


--- Processing multiple payments through a unified interface ---
Processing payment of $50.0 through Stripe Gateway.
Executing payment of $50.0 via PayPal Gateway.
Explanation of the Adapter Pattern in this example:

Target Interface (PaymentProcessor): This is the interface that your client code (e.g., PaymentClient) expects to work with. It defines the processPayment(double amount) method, which is the standardized way to handle payments in your system.

Adaptee Classes (StripeGateway, PayPalGateway): These are the existing, incompatible third-party payment gateways. They have their own unique methods (charge, refund for Stripe; makePayment, cancelPayment for PayPal) that don't directly match your PaymentProcessor interface. These are the "foreign" interfaces you need to adapt.

Adapter Classes (StripeAdapter, PayPalAdapter):

Each adapter implements the PaymentProcessor (the Target Interface).
Each adapter contains an instance of its respective Adaptee (e.g., StripeAdapter has a StripeGateway object). This is known as Object Adapter (composition).
When the client calls processPayment() on an adapter, the adapter translates that call into the appropriate method of the underlying adaptee. For example, StripeAdapter.processPayment() calls stripeGateway.charge().
Benefits of using the Adapter Pattern here:

Interoperability: It allows classes with incompatible interfaces to work together. Your PaymentClient can seamlessly interact with different gateways through the unified PaymentProcessor interface.
Decoupling: The client code is decoupled from the specific implementations of the third-party gateways. If a new gateway is added or an existing one changes its interface, only the corresponding adapter needs modification, not the client code.
Reusability: You can reuse existing third-party components (the Adaptees) without modifying their source code.
Flexibility: You can easily switch between different payment gateways at runtime by simply instantiating a different adapter.






 */
}
