package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.Lesson;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
    
}
