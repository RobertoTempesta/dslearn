package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.Section;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
    
}
