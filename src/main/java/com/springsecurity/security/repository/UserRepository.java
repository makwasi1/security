package com.springsecurity.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.security.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsernameOrEmail(String username, String email);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
