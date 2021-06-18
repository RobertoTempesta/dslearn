package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
