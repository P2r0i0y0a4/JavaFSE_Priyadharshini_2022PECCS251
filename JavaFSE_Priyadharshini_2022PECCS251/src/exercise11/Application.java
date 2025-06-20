package exercise11;

public class Application {
    public static void main(String[] args) {
        System.out.println("Demonstrating Dependency Injection:\n");

        // 1. Create the concrete dependency (CustomerRepositoryImpl)
        // This is the "wiring" or "composition root" where dependencies are resolved.
        CustomerRepository repository = new CustomerRepositoryImpl();

        // 2. Inject the dependency into the service class using its constructor
        CustomerService service = new CustomerService(repository);

        // 3. Use the service to perform operations
        System.out.println("\n--- Finding Customer 1 ---");
        Customer customer1 = service.getCustomerDetails("1");
        if (customer1 != null) {
            System.out.println("Found: " + customer1);
        } else {
            System.out.println("Customer 1 not found.");
        }

        System.out.println("\n--- Finding Customer 3 (Non-existent) ---");
        Customer customer3 = service.getCustomerDetails("3");
        if (customer3 != null) {
            System.out.println("Found: " + customer3);
        } else {
            System.out.println("Customer 3 not found.");
        }
    }
}