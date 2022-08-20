package com.devsuperior.dslearnbds.repository;

import com.devsuperior.dslearnbds.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String username);
}
