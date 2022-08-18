package com.devsuperior.dslearnbds.repository;

import com.devsuperior.dslearnbds.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
