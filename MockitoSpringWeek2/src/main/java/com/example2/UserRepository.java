package com.example2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for User entities.
 * Extends JpaRepository to inherit standard CRUD operations for the User entity.
 * JpaRepository<User, Long> means it manages User entities with a Long type ID.
 *
 * @Repository is a specialization of @Component that indicates that the class
 * provides the mechanism for storage, retrieval, search, update and delete operation on objects.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository provides methods like findById(), save(), findAll(), deleteById(), etc.
    // No custom methods are needed for this basic example.
}
