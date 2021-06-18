package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.Reply;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    
}
