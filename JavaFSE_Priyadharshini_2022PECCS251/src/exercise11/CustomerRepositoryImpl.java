package exercise11;

import java.util.HashMap;
import java.util.Map;

// Concrete Repository: Implements the data access operations.
public class CustomerRepositoryImpl implements CustomerRepository {

    // Simulate a database/data store
    private Map<String, Customer> customers;

    public CustomerRepositoryImpl() {
        customers = new HashMap<>();
        // Populate with some dummy data
        customers.put("1", new Customer("1", "Alice Smith", "alice@example.com"));
        customers.put("2", new Customer("2", "Bob Johnson", "bob@example.com"));
    }

    @Override
    public Customer findCustomerById(String id) {
        System.out.println("CustomerRepositoryImpl: Searching for customer with ID: " + id);
        // Simulate database lookup
        return customers.get(id);
    }
}