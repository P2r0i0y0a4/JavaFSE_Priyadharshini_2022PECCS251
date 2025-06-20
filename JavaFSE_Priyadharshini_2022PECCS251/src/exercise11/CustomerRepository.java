package exercise11;

//Repository Interface: Defines the contract for data access operations.
public interface CustomerRepository {
 Customer findCustomerById(String id);
 // Other methods like saveCustomer, deleteCustomer, etc., could be here
}