package com.psampedro.petrolinera.service;

import com.psampedro.petrolinera.model.ChargePoint;
import com.psampedro.petrolinera.dto.ChargePointDTO;
import com.psampedro.petrolinera.model.ChargePointType;
import com.psampedro.petrolinera.projection.ChargePointInfo;
import com.psampedro.petrolinera.projection.ElectrolineraInfo;
import com.psampedro.petrolinera.repository.*;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AdminService {
    private final ElectrolineraRepository electrolineraRep;
    private final ChargePointRepository chargePointRep;
    private final ChargePointTypeRepository chargePointTypeRepository;

    public AdminService(ElectrolineraRepository electrolineraRep, ChargePointRepository chargePointRep, ChargePointTypeRepository chargePointTypeRepository){
        this.electrolineraRep = electrolineraRep;
        this.chargePointRep = chargePointRep;
        this.chargePointTypeRepository = chargePointTypeRepository;
    }

    public List<ElectrolineraInfo> getInfoElectrolineras()
    {
        return electrolineraRep.getInfoElectrolineras();
    }

    public List<ChargePointInfo> getInfoElectrolinera(String name){
        return chargePointRep.getChargePointByElectrolineraEquals(name);
    }

    public List<String> getAllChargerLevels(){
        return chargePointTypeRepository.findAll().stream().map(e->e.getLevel()).collect(Collectors.toList());
    }

    @Transactional
    public Boolean modifyChargePointById(ChargePointDTO cpInfo)
    {
        Optional<ChargePoint> result = chargePointRep.findById(cpInfo.getId());
        if (result.isEmpty()) return false;
        ChargePoint record = result.get();
        if (cpInfo.getLevel() != null) {
            Optional<ChargePointType> level = chargePointTypeRepository.findById(cpInfo.getLevel());
            if (level.isEmpty()) return false;
            record.setChargePointType(level.get());
        }
        if (cpInfo.getTimeAllocationUnit() != null ) record.setTimeAllocationUnit(cpInfo.getTimeAllocationUnit());
        return true;
    }

    public Boolean addChargePoint(ChargePointDTO cpInfo)
    {
        if (cpInfo.getElectrolineraId() == null || cpInfo.getLevel() == null || cpInfo.getTimeAllocationUnit() == null) return false;
        ChargePoint newCP = new ChargePoint();
        newCP.setChargePointType(chargePointTypeRepository.findById(cpInfo.getLevel()).orElse(null));
        newCP.setElectrolinera(electrolineraRep.findById(cpInfo.getElectrolineraId()).orElse(null));
        newCP.setTimeAllocationUnit(cpInfo.getTimeAllocationUnit());
        chargePointRep.saveAndFlush(newCP);
        return true;
    }

    public void deleteChargePointById(Integer id)
    {
        chargePointRep.deleteById(id);
    }

    public Integer getElectrolineraIdByName(String name)
    {
        Optional<Integer> id = electrolineraRep.getIdByName(name);
        return id.orElse(-1);
    }
}
