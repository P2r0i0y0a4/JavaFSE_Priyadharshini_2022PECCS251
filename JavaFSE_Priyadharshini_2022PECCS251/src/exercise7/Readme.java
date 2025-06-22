package exercise7;

public class Readme {

/*
 * Project Structure:

ObserverPatternExample
├── src
│   └── com
│       └── stockmarket
│           ├── Stock.java
│           ├── StockMarket.java
│           ├── Observer.java
│           ├── MobileApp.java
│           ├── WebApp.java
│           └── StockMarketSimulator.java
Code Implementation:

1. Define Subject Interface:

src/com/stockmarket/Stock.java

2. Implement Concrete Subject:

src/com/stockmarket/StockMarket.java

3. Define Observer Interface:

src/com/stockmarket/Observer.java

4. Implement Concrete Observers:

src/com/stockmarket/MobileApp.java

5. Test the Observer Implementation:

src/com/stockmarket/StockMarketSimulator.java

Output:

Demonstrating Observer Pattern for Stock Market Monitoring:

StockMarket for GOOGL created with initial price: $150.0
StockMarket for AAPL created with initial price: $180.0

--- Registering Observers for GOOGL ---
User1's Phone registered to GOOGL
User2's Browser registered to GOOGL
Admin's Tablet registered to GOOGL

--- Price Change for GOOGL: Old Price = $150.0, New Price = $152.5 ---

Notifying observers about price change for GOOGL...
User1's Phone (Mobile App) received update: GOOGL is now $152.5
User2's Browser (Web App) received update: GOOGL is now $152.5. Updating dashboard...
Admin's Tablet (Mobile App) received update: GOOGL is now $152.5
Price for GOOGL remains $152.5. No notification sent.

--- Registering User1's Phone for AAPL ---
User1's Phone registered to AAPL

--- Price Change for AAPL: Old Price = $180.0, New Price = $185.75 ---

Notifying observers about price change for AAPL...
User1's Phone (Mobile App) received update: AAPL is now $185.75

--- Deregistering User2's Browser from GOOGL ---
User2's Browser deregistered from GOOGL

--- Price Change for GOOGL: Old Price = $152.5, New Price = $151.0 ---

Notifying observers about price change for GOOGL...
User1's Phone (Mobile App) received update: GOOGL is now $151.0
Admin's Tablet (Mobile App) received update: GOOGL is now $151.0

--- Price Change for AAPL: Old Price = $185.75, New Price = $186.0 ---

Notifying observers about price change for AAPL...
User1's Phone (Mobile App) received update: AAPL is now $186.0
Explanation of the Observer Pattern in this example:

Subject Interface (Stock):

Defines the contract for subjects (publishers). It specifies methods to:
registerObserver(Observer o): To add an observer to its list.
deregisterObserver(Observer o): To remove an observer from its list.
notifyObservers(): To inform all registered observers about a state change.
Concrete Subject (StockMarket):

Implements the Stock interface.
Maintains a list of Observer objects.
Has a state (e.g., stockPrice, stockSymbol).
When its state changes (e.g., setStockPrice() is called), it calls notifyObservers() to push the update to all registered observers.
Observer Interface (Observer):

Defines the contract for observers (subscribers).
It typically has an update() method that the subject calls to notify the observer of a change. The parameters passed to update() can vary based on what information the observer needs (here, stockSymbol and stockPrice).
Concrete Observers (MobileApp, WebApp):

Implement the Observer interface.
Each concrete observer provides its specific way of reacting to an update from the subject (e.g., displaying a message on a mobile app, updating a web dashboard).
Benefits of using the Observer Pattern here:

Loose Coupling: The subject (StockMarket) and observers (MobileApp, WebApp) are loosely coupled. The subject doesn't need to know the concrete types of its observers; it only interacts with them via the Observer interface. Observers also don't need to know about the concrete subject.
Scalability and Extensibility: You can easily add new types of observers (e.g., a desktop application, an email notifier) without modifying the StockMarket class. You just need to implement the Observer interface.
Dynamic Relationships: Observers can be registered and deregistered at runtime, allowing clients to subscribe or unsubscribe to notifications as needed.
Event-Driven Communication: It's a fundamental pattern for building event-driven systems where changes in one part of the system trigger actions in other, dependent parts.

 */
}
