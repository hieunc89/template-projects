package com.app.repo;

import com.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findOneByUserId(String userId);
    Optional<User> findOneByUserIdAndPassword(String userId, String password);
}

