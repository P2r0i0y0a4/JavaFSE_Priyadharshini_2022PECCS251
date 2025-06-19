package javafse;
class Logger {

    // Step 1: Create a private static instance of the Logger
    private static Logger instance;

    // Step 2: Make the constructor private so that new instances cannot be created externally
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Provide a public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Logger method to simulate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}


