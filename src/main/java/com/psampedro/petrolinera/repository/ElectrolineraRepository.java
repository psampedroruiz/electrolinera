package com.psampedro.petrolinera.repository;

import com.psampedro.petrolinera.model.Electrolinera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ElectrolineraRepository extends JpaRepository<Electrolinera, Integer> {

    @Query("SELECT e.name AS nombre, (SELECT COUNT(cp) FROM ChargePoint cp WHERE cp.chargePointType.level = 'N1' AND cp.electrolinera.id = e.id) AS numeroRapidos,\n" +
            "           (SELECT COUNT(cp) FROM ChargePoint cp WHERE cp.chargePointType.level = 'N2' AND cp.electrolinera.id = e.id) AS numeroSemiRapidos, \n" +
            "           (SELECT COUNT(cp) FROM ChargePoint cp WHERE cp.chargePointType.level = 'N3' AND cp.electrolinera.id = e.id) AS numeroLentos ,\n" +
            "           e.type AS tipo, e.geoLocation AS geoLocalizacion\n" +
            "    FROM Electrolinera e")
    List<ElectrolineraInfo> getInfoElectrolineras();
}