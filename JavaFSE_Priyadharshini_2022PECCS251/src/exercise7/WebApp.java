package exercise7;

//Concrete Observer 2: Represents a web application client.
public class WebApp implements Observer {
 private String browserName;

 public WebApp(String browserName) {
     this.browserName = browserName;
 }

 @Override
 public void update(String stockSymbol, double stockPrice) {
     System.out.println(browserName + " (Web App) received update: " + stockSymbol + " is now $" + stockPrice + ". Updating dashboard...");
     // Additional logic for web app, e.g., update UI elements
 }
}