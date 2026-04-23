package com.psampedro.petrolinera.service;

import com.psampedro.petrolinera.dto.ChargePointDTO;
import com.psampedro.petrolinera.model.ChargePoint;
import com.psampedro.petrolinera.model.ChargePointType;
import com.psampedro.petrolinera.repository.ChargePointTypeRepository;
import com.psampedro.petrolinera.repository.ElectrolineraRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
class ChargePointMapper {

    private final ElectrolineraRepository eRep;
    private final ChargePointTypeRepository cptRep;

    public ChargePointMapper(ElectrolineraRepository eRep, ChargePointTypeRepository cptRep)
    {
        this.eRep = eRep;
        this.cptRep = cptRep;
    }

    public ChargePointDTO toDTO(ChargePoint cp)
    {
        ChargePointDTO out = new ChargePointDTO();
        out.setId(cp.getId());
        out.setLevel(cp.getChargePointType().getLevel());
        out.setElectrolineraId(cp.getElectrolinera().getId());
        out.setTimeAllocationUnit(cp.getTimeAllocationUnit());
        return out;
    }
}
