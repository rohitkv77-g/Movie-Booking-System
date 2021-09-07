package com.rohit.movieBookingSystem.dao;

import com.rohit.movieBookingSystem.entities.Status;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusDao extends JpaRepository<Status, Integer> {
    public Status findByStatusName(String statusName);
}
