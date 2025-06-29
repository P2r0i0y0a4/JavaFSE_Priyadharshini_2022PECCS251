package com.example2;
import java.util.Optional;
public interface UserRepository {
    Optional<User> findById(long id);

	

}
