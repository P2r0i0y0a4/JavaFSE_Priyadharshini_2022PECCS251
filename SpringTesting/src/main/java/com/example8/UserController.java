package com.example8;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getUser(@PathVariable Long id) {
        if (id == 1L) {
            return ResponseEntity.ok("User Found");
        } else {
            throw new NoSuchElementException("User not found");
        }
    }
}
