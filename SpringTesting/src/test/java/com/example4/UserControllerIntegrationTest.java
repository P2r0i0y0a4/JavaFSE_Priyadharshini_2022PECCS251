package com.example4;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Integration Test class for UserController using Spring Boot's @SpringBootTest.
 * This test loads the full Spring application context, including all components
 * (@Controller, @Service, etc.), allowing the test to verify the complete
 * request processing flow from the controller down to the actual service implementation.
 *
 * @SpringBootTest loads the complete Spring Boot application context.
 * The 'webEnvironment = SpringBootTest.WebEnvironment.MOCK' (which is the default)
 * ensures that an embedded server is NOT started, but a mock web environment is set up.
 *
 * @AutoConfigureMockMvc automatically configures and injects a MockMvc instance
 * when used with @SpringBootTest, allowing for web layer testing without a running server.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerIntegrationTest {

    // MockMvc is now automatically configured and injected because of @AutoConfigureMockMvc.
    @Autowired
    private MockMvc mockMvc;

    /**
     * Test case for successful retrieval of a user via the full integration flow.
     * This test sends a request to the UserController, which then calls the
     * actual UserServiceImpl, and verifies the HTTP response.
     */
    @Test
    public void testGetUser_Success() throws Exception {
        // 1. Act (When): Perform the HTTP GET request using MockMvc.
        // We expect the UserServiceImpl (which is now part of the loaded context)
        // to return "Alice" for ID 1L.
        mockMvc.perform(get("/users/1") // Simulates a GET request to "/users/1"
               .accept(MediaType.APPLICATION_JSON)) // Sets the Accept header to application/json

               // 2. Assert (Then): Verify the results.
               .andExpect(status().isOk()) // Asserts that the HTTP status is 200 OK
               .andExpect(content().contentType(MediaType.APPLICATION_JSON)) // Asserts content type is JSON
               .andExpect(jsonPath("$.id").value(1)) // Asserts the 'id' field in the JSON response
               .andExpect(jsonPath("$.name").value("Alice")); // Asserts the 'name' field in the JSON response
    }

    /**
     * Test case for when a user is not found, via the full integration flow.
     * This test sends a request to the UserController, which calls the actual
     * UserServiceImpl, and verifies the HTTP response when the service returns null.
     */
    @Test
    public void testGetUser_NotFound() throws Exception {
        // 1. Act (When): Perform the HTTP GET request.
        // We expect the UserServiceImpl to return null for any ID other than 1L (e.g., 2L).
        mockMvc.perform(get("/users/2") // Simulates a GET request to "/users/2"
               .accept(MediaType.APPLICATION_JSON)) // Sets the Accept header

               // 2. Assert (Then): Verify the results.
               .andExpect(status().isOk()) // Asserts that the HTTP status is 200 OK
               .andExpect(content().string("")); // Asserts that the response body is an empty string.
                                                 // This reflects the current UserController's behavior of
                                                 // returning ResponseEntity.ok(null) for a non-existent user.
    }
}
