package com.example5;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        // For demo, just return the same user with a dummy ID
        user.setId(1L);
        return user;
    }

    @Override
    public User getUserById(Long id) {
        // Dummy data for demo
        if (id == 1L) {
            User user = new User();
            user.setId(1L);
            user.setName("Alice");
            return user;
        }
        return null;
    }
}
