package com.psampedro.petrolinera.repository;

import com.psampedro.petrolinera.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}