package com.example; // Changed from com.example3 to com.example

import org.springframework.stereotype.Service;

/**
 * Implementation of the UserService interface.
 * This class provides the actual business logic for user operations.
 * The @Service annotation marks this class as a Spring service component.
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * Retrieves a user by their ID.
     * In a real application, this would interact with a database (e.g., via a UserRepository).
     * For this demo, it returns a hardcoded dummy user for ID 1, otherwise null.
     * @param id The ID of the user.
     * @return A User object if id is 1L, otherwise null.
     */
    @Override
    public User getUserById(Long id) {
        // Simulate fetching from a database or external system
        if (id == 1L) {
            User user = new User();
            user.setId(1L);
            user.setName("Alice");
            return user;
        }
        // If the ID is not 1L, simulate user not found
        return null;
    }
}
