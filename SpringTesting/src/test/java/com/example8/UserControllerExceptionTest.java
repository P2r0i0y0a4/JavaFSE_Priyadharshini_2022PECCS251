package com.example8;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserController.class)   // Only load UserController
@Import(GlobalExceptionHandler.class) // Import your ControllerAdvice
public class UserControllerExceptionTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUserNotFoundExceptionHandled() throws Exception {
        mockMvc.perform(get("/users/99"))
                .andExpect(status().isNotFound())
                .andExpect(content().string("User not found"));
    }

    @Test
    public void testUserFound() throws Exception {
        mockMvc.perform(get("/users/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("User Found"));
    }
}
