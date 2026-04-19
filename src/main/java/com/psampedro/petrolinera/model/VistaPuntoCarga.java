package com.psampedro.petrolinera.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "vista_punto_carga", schema = "petrolinera")
public class VistaPuntoCarga {
    @Id
    @Column(name = "identificador", nullable = false)
    private Integer identificador;

    @Column(name = "id_electrolinera", nullable = false)
    private Integer idElectrolinera;

    @Column(name = "tipo_corriente", nullable = false, length = 2)
    private String tipoCorriente;

    @Column(name = "rango_potencia", length = 45)
    private String rangoPotencia;

    @Column(name = "rodaja_mins", nullable = false)
    private Integer rodajaMins;

    public Integer getIdentificador() {
        return identificador;
    }

    public Integer getIdElectrolinera() {
        return idElectrolinera;
    }

    public String getTipoCorriente() {
        return tipoCorriente;
    }

    public String getRangoPotencia() {
        return rangoPotencia;
    }

    public Integer getRodajaMins() {
        return rodajaMins;
    }

}