package com.example3;

// Static imports for Mockito methods (mock, when, verify, times)
import static org.mockito.Mockito.*;
// Static imports for MockMvc request builders (get) and result matchers (status, content, jsonPath)
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach; // JUnit 5 annotation for setup method
import org.junit.jupiter.api.Test;     // JUnit 5 annotation for test methods
import org.mockito.*;                   // Mockito annotations (Mock, InjectMocks, MockitoAnnotations)
import org.springframework.http.MediaType; // For specifying content type in requests
import org.springframework.test.web.servlet.MockMvc; // Main class for testing Spring MVC controllers
import org.springframework.test.web.servlet.setup.MockMvcBuilders; // Builder for MockMvc instances

/**
 * Test class for UserController using Spring's MockMvc and Mockito.
 * This class performs unit tests for the REST endpoints defined in UserController
 * by mocking its dependencies.
 */
public class UserControllerTest {

    private MockMvc mockMvc; // MockMvc instance to perform HTTP requests against the controller

    @Mock // Mockito annotation to create a mock object for UserService.
          // This ensures that the actual UserService implementation is not called during tests.
    private UserService userService;

    @InjectMocks // Mockito annotation to inject the created mocks into the UserController.
                 // This tells Mockito to create a UserController instance and inject 'userService' into it.
    private UserController userController;

    /**
     * Setup method executed before each test method.
     * Initializes Mockito annotations and sets up MockMvc.
     */
    @BeforeEach
    public void setup() {
        // Initializes fields annotated with @Mock and injects them into fields annotated with @InjectMocks.
        MockitoAnnotations.openMocks(this);
        // Builds a MockMvc instance for standalone testing of the userController.
        // This is suitable for unit testing a single controller without loading the full Spring application context.
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    /**
     * Test case for successful retrieval of a user.
     * It mocks the userService to return a predefined User object and then
     * verifies the controller's response (HTTP status, content type, and JSON payload).
     */
    @Test
    public void testGetUser_Success() throws Exception {
        // 1. Arrange (Given): Prepare the mock behavior and test data.
        User user = new User();
        user.setId(1L);
        user.setName("Alice");

        // Stubbing the userService.getUserById method to return the predefined 'user' object
        // when called with ID 1L.
        when(userService.getUserById(1L)).thenReturn(user);

        // 2. Act (When): Perform the HTTP GET request using MockMvc.
        mockMvc.perform(get("/users/1") // Simulates a GET request to "/users/1"
               .accept(MediaType.APPLICATION_JSON)) // Sets the Accept header to application/json

               // 3. Assert (Then): Verify the results.
               .andExpect(status().isOk()) // Asserts that the HTTP status is 200 OK
               .andExpect(content().contentType(MediaType.APPLICATION_JSON)) // Asserts content type is JSON
               .andExpect(jsonPath("$.id").value(1)) // Asserts the 'id' field in the JSON response
               .andExpect(jsonPath("$.name").value("Alice")); // Asserts the 'name' field in the JSON response

        // Verify that userService.getUserById was called exactly once with the argument 1L.
        verify(userService, times(1)).getUserById(1L);
    }

    /**
     * Test case for when a user is not found.
     * It mocks the userService to return null and verifies that the controller
     * returns an OK status with an empty body (as per current controller logic for null).
     */    @Test
    public void testGetUser_NotFound() throws Exception {
        // 1. Arrange (Given): Stub the userService to return null for ID 2L.
        when(userService.getUserById(2L)).thenReturn(null);

        // 2. Act (When): Perform the HTTP GET request.
        mockMvc.perform(get("/users/2") // Simulates a GET request to "/users/2"
               .accept(MediaType.APPLICATION_JSON)) // Sets the Accept header

               // 3. Assert (Then): Verify the results.
               .andExpect(status().isOk()) // Asserts that the HTTP status is 200 OK
               .andExpect(content().string("")); // Asserts that the response body is an empty string.
                                                 // This happens because ResponseEntity.ok(null) results in an empty body.

        // Verify that userService.getUserById was called exactly once with the argument 2L.
        verify(userService, times(1)).getUserById(2L);
    }
}
