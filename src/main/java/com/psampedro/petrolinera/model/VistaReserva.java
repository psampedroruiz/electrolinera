package com.psampedro.petrolinera.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "vista_reservas", schema = "petrolinera")
public class VistaReserva {
    @Column(name = "fecha_reserva", nullable = false)
    private Integer fechaReserva;

    @Column(name = "nombre_usuario", nullable = false)
    private String nombreUsuario;

    @Column(name = "matricula", nullable = false, length = 32)
    private String matricula;

    @Column(name = "nombre_electrolinera", nullable = false)
    private String nombreElectrolinera;

    @Column(name = "id_punto_recarga", nullable = false)
    private Integer idPuntoRecarga;

    @Column(name = "nivel", nullable = false, length = 16)
    private String nivel;

    @Column(name = "fecha_suministro", nullable = false)
    private Integer fechaSuministro;

    @Column(name = "hora_inicio", nullable = false)
    private Integer horaInicio;

    @Column(name = "duracion", nullable = false)
    private Integer duracion;

    @Id
    @Column(name = "referencia_reserva", nullable = false)
    private Integer referenciaReserva;

    public Integer getFechaReserva() {
        return fechaReserva;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombreElectrolinera() {
        return nombreElectrolinera;
    }

    public Integer getIdPuntoRecarga() {
        return idPuntoRecarga;
    }

    public String getNivel() {
        return nivel;
    }

    public Integer getFechaSuministro() {
        return fechaSuministro;
    }

    public Integer getHoraInicio() {
        return horaInicio;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getReferenciaReserva() {
        return referenciaReserva;
    }

}