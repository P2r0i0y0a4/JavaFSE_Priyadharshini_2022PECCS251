package exercise5;

//Concrete Component: The basic notifier that can be decorated.
public class EmailNotifier implements Notifier {
 @Override
 public void send(String message) {
     System.out.println("Sending Email notification: " + message);
 }
}