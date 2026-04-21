package com.psampedro.petrolinera.projection;

import com.psampedro.petrolinera.model.Electrolinera;

/**
 * Projection for {@link Electrolinera}
 */
public interface ElectrolineraInfo {
    String getNombre();

    Integer getNumeroRapidos();

    Integer getNumeroSemiRapidos();

    Integer getNumeroLentos();

    String getTipo();

    String getGeoLocalizacion();
}