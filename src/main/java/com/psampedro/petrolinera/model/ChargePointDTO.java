package com.psampedro.petrolinera.model;

public class ChargePointDTO {
    private Integer id;
    private String level;
    private Integer timeAllocationUnit;

    public String getLevel() {
        return level;
    }

    public Integer getId() {
        return id;
    }

    public Integer getTimeAllocationUnit() {
        return timeAllocationUnit;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setTimeAllocationUnit(Integer timeAllocationUnit) {
        this.timeAllocationUnit = timeAllocationUnit;
    }
}
