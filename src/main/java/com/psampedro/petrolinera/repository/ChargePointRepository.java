package com.psampedro.petrolinera.repository;

import com.psampedro.petrolinera.model.ChargePoint;
import com.psampedro.petrolinera.model.Electrolinera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ChargePointRepository extends JpaRepository<ChargePoint, Integer> {
    @Query( "    SELECT c.id AS id, c.electrolinera.id AS electrolineraId,\n" +
            "           cpt.current AS tipoCorriente, CONCAT(cpt.minPowerSupply,'-',cpt.maxPowerSupply) AS potencia,\n" +
            "           c.timeAllocationUnit AS rodaja\n" +
            "    FROM ChargePoint c \n" +
            "    JOIN ChargePointType cpt ON c.chargePointType.level = cpt.level \n"+
            "    JOIN Electrolinera e ON c.electrolinera.id = e.id WHERE e.name = :elName")
    List<ChargePointInfo> getChargePointByElectrolineraEquals(@Param("elName") String electrolineraName);
}