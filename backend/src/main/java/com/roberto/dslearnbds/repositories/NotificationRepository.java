package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.Notification;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    
}
