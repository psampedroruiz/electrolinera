package com.psampedro.petrolinera.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "charge_point", schema = "petrolinera")
public class ChargePoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "electrolinera_id", nullable = false)
    private Electrolinera electrolinera;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "level", nullable = false)
    private ChargePointType chargePointType;

    @Column(name = "time_Allocation_Unit", nullable = false)
    private Integer timeAllocationUnit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Electrolinera getElectrolinera() {
        return electrolinera;
    }

    public void setElectrolinera(Electrolinera electrolinera) {
        this.electrolinera = electrolinera;
    }

    public ChargePointType getChargePointType() {
        return chargePointType;
    }

    public void setChargePointType(ChargePointType level) {
        this.chargePointType = chargePointType;
    }

    public Integer getTimeAllocationUnit() {
        return timeAllocationUnit;
    }

    public void setTimeAllocationUnit(Integer timeAllocationUnit) {
        this.timeAllocationUnit = timeAllocationUnit;
    }

}