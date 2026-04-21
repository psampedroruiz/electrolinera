package com.psampedro.petrolinera.dto;

public class ChargePointDTO {
    private Integer id;
    private Integer electrolineraId;
    private String level;
    private Integer timeAllocationUnit;

    public String getLevel() {
        return level;
    }

    public Integer getElectrolineraId() {
        return electrolineraId;
    }

    public void setElectrolineraId(Integer electrolineraId) {
        this.electrolineraId = electrolineraId;
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
