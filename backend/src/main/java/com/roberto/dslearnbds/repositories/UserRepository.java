package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
 
    User findByEmail(String email);
    
}
