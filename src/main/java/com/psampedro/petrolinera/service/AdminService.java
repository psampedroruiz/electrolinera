package com.psampedro.petrolinera.service;

import com.psampedro.petrolinera.repository.ChargePointInfo;
import org.springframework.stereotype.Service;
import com.psampedro.petrolinera.repository.ChargePointRepository;
import com.psampedro.petrolinera.repository.ElectrolineraInfo;
import com.psampedro.petrolinera.repository.ElectrolineraRepository;

import java.util.List;

@Service
public class AdminService {
    private final ElectrolineraRepository electrolineraRep;
    private final ChargePointRepository chargePointRep;

    public AdminService(ElectrolineraRepository electrolineraRep, ChargePointRepository chargePointRep){
        this.electrolineraRep = electrolineraRep;
        this.chargePointRep = chargePointRep;
    };

    public List<ElectrolineraInfo> getInfoElectrolineras()
    {
        return electrolineraRep.getInfoElectrolineras();
    }

    public List<ChargePointInfo> getInfoElectrolinera(String name){
        return chargePointRep.getChargePointByElectrolineraEquals(name);
    }


}
