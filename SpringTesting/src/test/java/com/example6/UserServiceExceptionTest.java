package com.example6;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UserServiceExceptionTest {

    @Test
    public void testGetUserById_UserNotFound_ThrowsException() {
        UserServiceImpl userService = new UserServiceImpl();

        // Verify that calling getUserById with missing id throws UserNotFoundException
        assertThrows(UserNotFoundException.class, () -> {
            userService.getUserById(99L);
        });
    }
}
