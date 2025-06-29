package com.example2;

import jakarta.persistence.Entity; // Use jakarta.persistence for Spring Boot 3+
import jakarta.persistence.Id;     // Use jakarta.persistence for Spring Boot 3+
import java.util.Objects; // For equals and hashCode

/**
 * Represents a User entity with basic properties, configured for JPA.
 * This class will be mapped to a database table.
 */
@Entity // Marks this class as a JPA entity, representing a table in the database.
public class User {
    @Id // Marks the 'id' field as the primary key of the entity.
    private Long id;
    private String name;

    // Default no-args constructor is required by JPA and Spring for object instantiation.
    public User() {}

    // Constructor with arguments for convenience in creating User objects.
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Getters and setters for the User properties.
     * These are essential for JPA to access and populate the entity's fields.
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

    // Override equals and hashCode for proper comparison of User objects in tests and collections.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Override toString for better logging and debugging.
    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", name='" + name + '\'' +
               '}';
    }
}
