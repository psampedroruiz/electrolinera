package com.psampedro.petrolinera.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "vista_electrolineras", schema = "petrolinera")
public class VistaElectrolinera {
    @Id
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "cantidad_rapidos")
    private Long cantidadRapidos;

    @Column(name = "cantidad_semi_rapidos")
    private Long cantidadSemiRapidos;

    @Column(name = "cantidad_lentos")
    private Long cantidadLentos;

    @Lob
    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "loc_geografica", nullable = false, length = 32)
    private String locGeografica;

    public String getNombre() {
        return nombre;
    }

    public Long getCantidadRapidos() {
        return cantidadRapidos;
    }

    public Long getCantidadSemiRapidos() {
        return cantidadSemiRapidos;
    }

    public Long getCantidadLentos() {
        return cantidadLentos;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLocGeografica() {
        return locGeografica;
    }

}