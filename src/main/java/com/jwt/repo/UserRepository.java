package com.jwt.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}