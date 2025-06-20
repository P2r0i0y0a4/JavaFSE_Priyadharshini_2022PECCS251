package exercise7;
import java.util.ArrayList;
import java.util.List;

// Concrete Subject: Maintains the state and notifies observers when its state changes.
public class StockMarket implements Stock {
    private List<Observer> observers;
    private double stockPrice;
    private String stockSymbol;

    public StockMarket(String stockSymbol, double initialPrice) {
        this.observers = new ArrayList<>();
        this.stockSymbol = stockSymbol;
        this.stockPrice = initialPrice;
        System.out.println("StockMarket for " + stockSymbol + " created with initial price: $" + initialPrice);
    }

    // Methods from the Subject interface
    @Override
    public void registerObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
            System.out.println(o.getClass().getSimpleName() + " registered to " + stockSymbol);
        }
    }

    @Override
    public void deregisterObserver(Observer o) {
        observers.remove(o);
        System.out.println(o.getClass().getSimpleName() + " deregistered from " + stockSymbol);
    }

    @Override
    public void notifyObservers() {
        System.out.println("\nNotifying observers about price change for " + stockSymbol + "...");
        for (Observer observer : observers) {
            observer.update(stockSymbol, stockPrice);
        }
    }

    // Method to change the stock price and trigger notifications
    public void setStockPrice(double newPrice) {
        if (this.stockPrice != newPrice) {
            System.out.println("\n--- Price Change for " + stockSymbol + ": Old Price = $" + this.stockPrice + ", New Price = $" + newPrice + " ---");
            this.stockPrice = newPrice;
            notifyObservers(); // Notify observers when the price changes
        } else {
            System.out.println("Price for " + stockSymbol + " remains $" + newPrice + ". No notification sent.");
        }
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }
}