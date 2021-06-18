package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.Enrollment;
import com.roberto.dslearnbds.entities.pk.EnrollmentPK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
    
}
