package com.devsuperior.dslearnbds.repository;

import com.devsuperior.dslearnbds.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
