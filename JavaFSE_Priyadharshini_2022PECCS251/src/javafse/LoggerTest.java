package javafse;
public class LoggerTest {

    public static void main(String[] args) {
        // Retrieve instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("First log message.");
        logger2.log("Second log message.");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton confirmed).");
        } else {
            System.out.println("Different logger instances exist (Singleton violated).");
        }
    }
}
