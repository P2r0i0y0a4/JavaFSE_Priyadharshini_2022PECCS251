package com.example;

import com.example.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public com.example2.User getUserById(Long id);
}
