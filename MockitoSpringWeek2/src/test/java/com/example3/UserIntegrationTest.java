package com.example3;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean; // Crucial for mocking beans in Spring context
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Integration Test for UserController that mocks its UserService dependency.
 * This test uses @SpringBootTest to load the full application context but replaces
 * the actual UserService bean with a Mockito mock using @MockBean.
 * This allows testing the controller in isolation from the actual service implementation
 * and its underlying repository, focusing on the web layer's interaction with the service.
 */
@SpringBootTest // Loads the complete Spring Boot application context.
@AutoConfigureMockMvc // Configures and injects a MockMvc instance.
public class UserIntegrationTest {

    @Autowired
    private MockMvc mockMvc; // Automatically injected by @AutoConfigureMockMvc

    // @MockBean replaces any existing UserService bean in the Spring application context
    // with a Mockito mock. This means when UserController (or any other component)
    // tries to inject UserService, it will get this mock instead of the real UserServiceImpl.
    @MockBean
    private UserService userService;

    /**
     * Test case for successful user retrieval, mocking the UserService.
     * We control what userService.getUserById(1L) returns.
     */
    @Test
    public void testGetUser_Success_MockedService() throws Exception {
        // 1. Arrange (Given): Prepare the mock behavior and test data.
        Long userId = 1L;
        User mockUser = new User(userId, "Bob"); // Create a mock user for this test

        // Stubbing the mocked userService:
        // When userService.getUserById(1L) is called (by the controller),
        // it should return our mockUser.
        when(userService.getUserById(userId)).thenReturn(mockUser);

        // 2. Act (When): Perform the HTTP GET request.
        mockMvc.perform(get("/users/" + userId) // Request for user with ID 1
               .accept(MediaType.APPLICATION_JSON))

               // 3. Assert (Then): Verify the results.
               .andExpect(status().isOk()) // Expect HTTP 200 OK
               .andExpect(content().contentType(MediaType.APPLICATION_JSON)) // Expect JSON content type
               .andExpect(jsonPath("$.id").value(userId)) // Assert ID in JSON
               .andExpect(jsonPath("$.name").value("Bob")); // Assert name in JSON

        // Verify that userService.getUserById was called exactly once with the specified ID.
        verify(userService, times(1)).getUserById(userId);
    }

    /**
     * Test case for user not found scenario, mocking the UserService.
     * We control what userService.getUserById(2L) returns (null).
     */
    @Test
    public void testGetUser_NotFound_MockedService() throws Exception {
        // 1. Arrange (Given): Prepare mock behavior for user not found.
        Long userId = 2L;

        // Stubbing the mocked userService:
        // When userService.getUserById(2L) is called, it should return null.
        when(userService.getUserById(userId)).thenReturn(null);

        // 2. Act (When): Perform the HTTP GET request.
        mockMvc.perform(get("/users/" + userId) // Request for user with ID 2
               .accept(MediaType.APPLICATION_JSON))

               // 3. Assert (Then): Verify the results.
               .andExpect(status().isOk()) // Expect HTTP 200 OK (as per current controller logic for null)
               .andExpect(content().string("")); // Expect an empty response body

        // Verify that userService.getUserById was called exactly once with the specified ID.
        verify(userService, times(1)).getUserById(userId);
    }
}
