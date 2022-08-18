package com.devsuperior.dslearnbds.repository;

import com.devsuperior.dslearnbds.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
