package exercise7;


//Subject Interface: Defines methods for attaching, detaching, and notifying observers.
public interface Stock {
 void registerObserver(Observer o);
 void deregisterObserver(Observer o);
 void notifyObservers();
}