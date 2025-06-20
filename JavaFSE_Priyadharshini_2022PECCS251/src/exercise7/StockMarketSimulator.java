package exercise7;

public class StockMarketSimulator {
    public static void main(String[] args) {
        System.out.println("Demonstrating Observer Pattern for Stock Market Monitoring:\n");

        // 1. Create a Stock Market (Subject)
        StockMarket googleStock = new StockMarket("GOOGL", 150.00);
        StockMarket appleStock = new StockMarket("AAPL", 180.00);

        // 2. Create Observers (Clients)
        MobileApp user1Mobile = new MobileApp("User1's Phone");
        WebApp user2Web = new WebApp("User2's Browser");
        MobileApp adminMobile = new MobileApp("Admin's Tablet");

        // 3. Register Observers to Google Stock
        System.out.println("\n--- Registering Observers for GOOGL ---");
        googleStock.registerObserver(user1Mobile);
        googleStock.registerObserver(user2Web);
        googleStock.registerObserver(adminMobile);

        // 4. Change Google Stock Price (triggers notification)
        googleStock.setStockPrice(152.50);
        googleStock.setStockPrice(152.50); // No change, no notification

        // 5. Register User1 to Apple Stock as well
        System.out.println("\n--- Registering User1's Phone for AAPL ---");
        appleStock.registerObserver(user1Mobile);

        // 6. Change Apple Stock Price (triggers notification)
        appleStock.setStockPrice(185.75);

        // 7. Deregister an Observer from Google Stock
        System.out.println("\n--- Deregistering User2's Browser from GOOGL ---");
        googleStock.deregisterObserver(user2Web);

        // 8. Change Google Stock Price again (User2 won't be notified)
        googleStock.setStockPrice(151.00);

        // 9. Change Apple Stock Price again
        appleStock.setStockPrice(186.00);
    }
}