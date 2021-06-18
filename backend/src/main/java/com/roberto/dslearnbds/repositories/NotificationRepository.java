package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.Notification;
import com.roberto.dslearnbds.entities.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    
    Page<Notification> findByUser(User user, Pageable pageable);

}
