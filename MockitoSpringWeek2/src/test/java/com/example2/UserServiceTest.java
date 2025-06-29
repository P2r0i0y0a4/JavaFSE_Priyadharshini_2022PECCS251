package com.example2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach; // JUnit 5 annotation for setup method
import org.junit.jupiter.api.Test;     // JUnit 5 annotation for test methods
import org.mockito.InjectMocks;         // Mockito annotation to inject mocks
import org.mockito.Mock;               // Mockito annotation to create mock objects
import org.mockito.MockitoAnnotations; // To initialize Mockito annotations
import java.util.Optional;             // For Optional<User> return type of findById

/**
 * Unit Test class for UserServiceImpl using Mockito.
 * This class tests the business logic within UserServiceImpl in isolation
 * by mocking its dependency, UserRepository.
 */
public class UserServiceTest {

    @Mock // Creates a mock instance of UserRepository.
          // This mock will behave according to our defined stubbing rules.
    private UserRepository userRepository;

    @InjectMocks // Injects the mocks created with @Mock (e.g., userRepository)
                 // into the fields of this UserServiceImpl instance.
    private UserServiceImpl userService;

    /**
     * Setup method executed before each test method.
     * Initializes fields annotated with @Mock and injects them into @InjectMocks.
     */
    @BeforeEach
    public void setup() {
        // This is crucial to initialize all @Mock and @InjectMocks annotated fields.
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Test case for successful retrieval of a user by ID.
     * Verifies that the service correctly returns a user when the repository finds one.
     */
    @Test
    public void testGetUserById_Success() {
        // 1. Arrange (Given): Prepare the mock behavior and test data.
        Long userId = 1L;
        User mockUser = new User(userId, "Alice"); // Create a mock user object

        // Stubbing the userRepository.findById method:
        // When findById(1L) is called on the mocked repository,
        // it should return an Optional containing our mockUser.
        when(userRepository.findById(userId)).thenReturn(Optional.of(mockUser));

        // 2. Act (When): Call the method under test in the service.
        User result = userService.getUserById(userId);

        // 3. Assert (Then): Verify the results.
        // Assert that the returned user is not null and matches our mock user.
        assertEquals(mockUser, result);
        // Verify that userRepository.findById was called exactly once with the specified ID.
        verify(userRepository, times(1)).findById(userId);
    }

    /**
     * Test case for when a user is not found by ID.
     * Verifies that the service correctly returns null when the repository finds no user.
     */
    @Test
    public void testGetUserById_NotFound() {
        // 1. Arrange (Given): Prepare the mock behavior for a user not found.
        Long userId = 2L;

        // Stubbing the userRepository.findById method:
        // When findById(2L) is called, it should return an empty Optional.
        when(userRepository.findById(userId)).thenReturn(Optional.empty());

        // 2. Act (When): Call the method under test.
        User result = userService.getUserById(userId);

        // 3. Assert (Then): Verify the results.
        // Assert that the returned result is null, indicating user not found.
        assertNull(result);
        // Verify that userRepository.findById was called exactly once with the specified ID.
        verify(userRepository, times(1)).findById(userId);
    }
}
