package com.psampedro.petrolinera.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "charge_point_type", schema = "petrolinera")
public class ChargePointType {
    @Id
    @Column(name = "level", nullable = false, length = 16)
    private String level;

    @Column(name = "type", nullable = false, length = 32)
    private String type;

    @Column(name = "current", nullable = false, length = 2)
    private String current;

    @Column(name = "min_Power_Supply", nullable = false)
    private Double minPowerSupply;

    @Column(name = "max_Power_Supply", nullable = false)
    private Double maxPowerSupply;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public Double getMinPowerSupply() {
        return minPowerSupply;
    }

    public void setMinPowerSupply(Double minPowerSupply) {
        this.minPowerSupply = minPowerSupply;
    }

    public Double getMaxPowerSupply() {
        return maxPowerSupply;
    }

    public void setMaxPowerSupply(Double maxPowerSupply) {
        this.maxPowerSupply = maxPowerSupply;
    }

}