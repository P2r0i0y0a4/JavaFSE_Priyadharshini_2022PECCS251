package exercise7;


//Concrete Observer 1: Represents a mobile application client.
public class MobileApp implements Observer {
 private String appName;

 public MobileApp(String appName) {
     this.appName = appName;
 }

 @Override
 public void update(String stockSymbol, double stockPrice) {
     System.out.println(appName + " (Mobile App) received update: " + stockSymbol + " is now $" + stockPrice);
     // Additional logic for mobile app, e.g., display push notification
 }
}