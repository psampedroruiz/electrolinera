package com.psampedro.petrolinera.repository;

import com.psampedro.petrolinera.model.ChargePointType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargePointTypeRepository extends JpaRepository<ChargePointType, String> {
}