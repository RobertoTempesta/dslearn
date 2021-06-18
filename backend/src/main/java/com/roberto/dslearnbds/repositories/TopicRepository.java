package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.Topic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    
}
