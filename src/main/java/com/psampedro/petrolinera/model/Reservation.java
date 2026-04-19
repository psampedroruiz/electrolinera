package com.psampedro.petrolinera.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "reservation", schema = "petrolinera")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Column(name = "reservation_date", nullable = false)
    private Integer reservationDate;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "car_plate", nullable = false, length = 32)
    private String carPlate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "charge_point_id", nullable = false)
    private ChargePoint chargePoint;

    @Column(name = "reserved_date", nullable = false)
    private Integer reservedDate;

    @Column(name = "reservedStartTime", nullable = false)
    private Integer reservedStartTime;

    @Column(name = "reserved_Units", nullable = false)
    private Integer reservedUnits;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReservationdate() {
        return reservationDate;
    }

    public void setReservationdate(Integer reservationdate) {
        this.reservationDate = reservationdate;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getCarplate() {
        return carPlate;
    }

    public void setCarplate(String carplate) {
        this.carPlate = carplate;
    }

    public ChargePoint getChargepoint() {
        return chargePoint;
    }

    public void setChargePoint(ChargePoint chargePoint) {
        this.chargePoint = chargePoint;
    }

    public Integer getReserveddate() {
        return reservedDate;
    }

    public void setReserveddate(Integer reserveddate) {
        this.reservedDate = reserveddate;
    }

    public Integer getReservedStartTime() {
        return reservedStartTime;
    }

    public void setReservedStartTime(Integer reservedStartTime) {
        this.reservedStartTime = reservedStartTime;
    }

    public Integer getReservedUnits() {
        return reservedUnits;
    }

    public void setReservedUnits(Integer reservedUnits) {
        this.reservedUnits = reservedUnits;
    }

}