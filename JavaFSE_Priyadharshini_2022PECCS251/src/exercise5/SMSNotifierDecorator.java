package exercise5;


//Concrete Decorator: Adds SMS notification functionality.
public class SMSNotifierDecorator extends NotifierDecorator {
 public SMSNotifierDecorator(Notifier wrappedNotifier) {
     super(wrappedNotifier);
 }

 @Override
 public void send(String message) {
     super.send(message); // Call the wrapped notifier's send method
     sendSMS(message);    // Add SMS specific functionality
 }

 private void sendSMS(String message) {
     System.out.println("Sending SMS notification: " + message);
 }
}