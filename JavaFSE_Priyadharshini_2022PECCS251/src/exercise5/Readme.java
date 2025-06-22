package exercise5;

public class Readme {

/*
 * Project Structure:

DecoratorPatternExample
├── src
│   └── com
│       └── notification
│           ├── Notifier.java
│           ├── EmailNotifier.java
│           ├── NotifierDecorator.java
│           ├── SMSNotifierDecorator.java
│           ├── SlackNotifierDecorator.java
│           └── NotificationClient.java
Code Implementation:

1. Define Component Interface:

src/com/notification/Notifier.java

2. Implement Concrete Component:

src/com/notification/EmailNotifier.java

3. Implement Decorator Classes:

src/com/notification/NotifierDecorator.java

4. Test the Decorator Implementation:

src/com/notification/NotificationClient.java

Output:

Demonstrating Decorator Pattern for Notification System:

--- Basic Email Notification ---
Sending Email notification: Urgent: Server is down!

--- Email + SMS Notification ---
Sending Email notification: Urgent: Server is down!
Sending SMS notification: Urgent: Server is down!

--- Email + Slack Notification ---
Sending Email notification: Urgent: Server is down!
Sending Slack message: Urgent: Server is down!

--- Email + SMS + Slack Notification ---
Sending Email notification: Urgent: Server is down!
Sending SMS notification: Urgent: Server is down!
Sending Slack message: Urgent: Server is down!

--- SMS Only then add Slack ---
Base SMS (simulated only for this example) : Reminder: Meeting at 3 PM
Sending Slack message: Reminder: Meeting at 3 PM
Explanation of the Decorator Pattern in this example:

Component Interface (Notifier):

Defines the core behavior (e.g., send(String message)). Both concrete components and decorators must adhere to this interface. This allows clients to treat decorated and undecorated objects uniformly.
Concrete Component (EmailNotifier):

This is the simplest, core implementation of the Notifier. It performs the basic email sending functionality. It's the object that will be wrapped or "decorated."
Abstract Decorator (NotifierDecorator):

This abstract class implements the Notifier interface.
It holds a protected reference to a Notifier object (wrappedNotifier). This is the key to the decorator pattern, allowing it to "wrap" another Notifier (either a concrete component or another decorator).
Its send() method simply delegates the call to the wrappedNotifier.send(). Concrete decorators will extend this behavior.
Concrete Decorator Classes (SMSNotifierDecorator, SlackNotifierDecorator):

These classes extend NotifierDecorator.
In their send() method, they first call super.send(message) to ensure the wrapped notifier's functionality is executed.
After (or before) the super.send(), they add their own specific behavior (e.g., sendSMS() or sendSlackMessage()). This is where the dynamic addition of functionality occurs.
Benefits of using the Decorator Pattern here:

Dynamic Functionality Addition: You can add new behaviors (SMS, Slack, Push Notification, etc.) to an object at runtime, rather than compile time.
Flexibility: You can combine multiple decorators in various ways to create complex behaviors (e.g., Email + SMS + Slack). This is evident in the allChannelNotifier example.
Avoids Subclassing Explosion: Instead of creating a large number of subclasses for every possible combination of features (e.g., EmailSMSNotifier, EmailSlackNotifier, EmailSMSSlackNotifier), you combine smaller, more focused decorators.
Single Responsibility Principle: Each decorator has a single responsibility (e.g., SMSNotifierDecorator is only concerned with SMS).






 */
}
