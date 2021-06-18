package com.roberto.dslearnbds.repositories;

import com.roberto.dslearnbds.entities.Offer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
    
}
