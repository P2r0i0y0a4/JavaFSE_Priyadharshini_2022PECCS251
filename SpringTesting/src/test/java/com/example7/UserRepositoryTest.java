package com.example7;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest  // spins up only JPA-related components and in-memory DB
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByName() {
        // Arrange: save some users
        User user1 = new User();
        user1.setId(1L);
        user1.setName("Alice");
        userRepository.save(user1);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Bob");
        userRepository.save(user2);

        User user3 = new User();
        user3.setId(3L);
        user3.setName("Alice");
        userRepository.save(user3);

        // Act: find users by name "Alice"
        List<User> usersNamedAlice = userRepository.findByName("Alice");

        // Assert
        assertThat(usersNamedAlice).hasSize(2);
        assertThat(usersNamedAlice).extracting(User::getName).containsOnly("Alice");
    }
}
