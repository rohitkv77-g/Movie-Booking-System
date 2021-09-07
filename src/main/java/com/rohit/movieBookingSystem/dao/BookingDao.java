package com.rohit.movieBookingSystem.dao;

import com.rohit.movieBookingSystem.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking, Integer> {
}
