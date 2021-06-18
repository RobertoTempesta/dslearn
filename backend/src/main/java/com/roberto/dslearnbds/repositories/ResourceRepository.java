package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.Resource;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    
}
