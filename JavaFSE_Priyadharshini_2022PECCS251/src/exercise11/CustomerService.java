package exercise11;

//Service Class: Contains business logic and depends on CustomerRepository.
public class CustomerService {
 private CustomerRepository customerRepository; // Dependency

 // 4. Implement Dependency Injection (Constructor Injection)
 // The CustomerRepository dependency is injected through the constructor.
 public CustomerService(CustomerRepository customerRepository) {
     this.customerRepository = customerRepository;
     System.out.println("CustomerService: Initialized with a CustomerRepository instance.");
 }

 public Customer getCustomerDetails(String customerId) {
     System.out.println("CustomerService: Fetching customer details for ID: " + customerId);
     // Business logic could be here before or after calling the repository
     return customerRepository.findCustomerById(customerId);
 }
}