package com.devsuperior.dslearnbds.repository;

import com.devsuperior.dslearnbds.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
