package com.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserService;

import java.util.Optional; // Used for findById's return type

/**
 * Implementation of the UserService interface.
 * This class provides the actual business logic for user operations,
 * now interacting with a UserRepository.
 */
@Service
public class UserServiceImpl implements UserService {

    // Autowire the UserRepository to interact with the database.
    @Autowired
    private UserRepository userRepository;

    /**
     * Retrieves a user by their ID from the repository.
     *
     * @param id The ID of the user to retrieve.
     * @return The User object if found, otherwise null.
     */
    @Override
    public User getUserById(Long id) {
        // userRepository.findById(id) returns an Optional<User>.
        // .orElse(null) unwraps the Optional, returning the User if present, or null if not.
        return userRepository.findById(id).orElse(null);
    }
}
