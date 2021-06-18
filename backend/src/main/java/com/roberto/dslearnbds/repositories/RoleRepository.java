package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
