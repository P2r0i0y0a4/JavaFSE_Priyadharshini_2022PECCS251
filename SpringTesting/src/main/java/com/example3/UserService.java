package com.example3;

/**
 * Interface for the User Service.
 * Defines the contract for user-related business logic operations.
 */
public interface UserService {
    /**
     * Retrieves a User object by their unique ID.
     * @param id The ID of the user to retrieve.
     * @return The User object if found, otherwise null.
     */
    User getUserById(Long id);
}
