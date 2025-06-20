package exercise5;

//Concrete Decorator: Adds Slack notification functionality.
public class SlackNotifierDecorator extends NotifierDecorator {
 public SlackNotifierDecorator(Notifier wrappedNotifier) {
     super(wrappedNotifier);
 }

 @Override
 public void send(String message) {
     super.send(message); // Call the wrapped notifier's send method
     sendSlackMessage(message); // Add Slack specific functionality
 }

 private void sendSlackMessage(String message) {
     System.out.println("Sending Slack message: " + message);
 }
}