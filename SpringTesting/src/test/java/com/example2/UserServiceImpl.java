package com.example2;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Constructor Injection (preferred)
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(long id) {
        Optional<User> userOpt = userRepository.findById(id);
        return userOpt.orElse(null);
    }
}
