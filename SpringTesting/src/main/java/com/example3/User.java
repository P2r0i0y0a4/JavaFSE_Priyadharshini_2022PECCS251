package com.example3;

/**
 * Represents a User entity with basic properties.
 * This class will be used as a DTO (Data Transfer Object) for REST responses.
 */
public class User {
    private Long id;    // Unique identifier for the user
    private String name; // Name of the user

    // Default no-args constructor is required by Spring for object deserialization (e.g., from JSON).
    public User() {}

    /**
     * Getters and setters for the User properties.
     * These are essential for Spring's object mapping (e.g., converting to/from JSON).
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
