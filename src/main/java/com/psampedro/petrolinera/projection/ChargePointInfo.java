package com.psampedro.petrolinera.projection;

/**
 * Projection for {@link com.psampedro.petrolinera.model.ChargePoint}
 */
public interface ChargePointInfo {
    Integer getId();

    Integer getElectrolineraId();

    String getNivel();

    String getTipoCorriente();

    String getPotencia();

    Integer getRodaja();
}