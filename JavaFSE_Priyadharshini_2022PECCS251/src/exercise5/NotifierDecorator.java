package exercise5;


//Abstract Decorator: Implements the Component interface and holds a reference to a Component object.
public abstract class NotifierDecorator implements Notifier {
 protected Notifier wrappedNotifier; // The object being decorated

 public NotifierDecorator(Notifier wrappedNotifier) {
     this.wrappedNotifier = wrappedNotifier;
 }

 // The default implementation simply delegates the call to the wrapped object.
 // Concrete decorators will override this to add their own behavior.
 @Override
 public void send(String message) {
     wrappedNotifier.send(message);
 }
}