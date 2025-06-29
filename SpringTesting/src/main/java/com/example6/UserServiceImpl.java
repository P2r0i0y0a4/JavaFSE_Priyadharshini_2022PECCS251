package com.example6;

import org.springframework.stereotype.Service;

import com.example5.User;
import com.example5.UserService;

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
        if (id == 1L) {
            User user = new User();
            user.setId(1L);
            user.setName("Alice");
            return user;
        }
        throw new UserNotFoundException("User with id " + id + " not found");
    }

}
