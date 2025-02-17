package com.comfa_reservas.Modelo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Infraestructura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInfraestructura;

    private String nombre;

    private Float tarifaPlena;

    private Integer disponibilidad;

    @ManyToOne
    @JoinColumn(name = "centro_recreativo_id")
    private CentroRecreativo centroRecreativo;

    @OneToMany(mappedBy = "infraestructura")
    @JsonIgnore
    private List<Reserva> reservas;

    // Getters y Setters

    public Infraestructura() {
    }

    public Infraestructura(Integer idInfraestructura, String nombre, Float tarifaPlena, Integer disponibilidad, CentroRecreativo centroRecreativo, List<Reserva> reservas) {
        this.idInfraestructura = idInfraestructura;
        this.nombre = nombre;
        this.tarifaPlena = tarifaPlena;
        this.disponibilidad = disponibilidad;
        this.centroRecreativo = centroRecreativo;
        this.reservas = reservas;
    }

    public Integer getIdInfraestructura() {
        return idInfraestructura;
    }

    public void setIdInfraestructura(Integer idInfraestructura) {
        this.idInfraestructura = idInfraestructura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getTarifaPlena() {
        return tarifaPlena;
    }

    public void setTarifaPlena(Float tarifaPlena) {
        this.tarifaPlena = tarifaPlena;
    }

    public Integer getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Integer disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public CentroRecreativo getCentroRecreativo() {
        return centroRecreativo;
    }

    public void setCentroRecreativo(CentroRecreativo centroRecreativo) {
        this.centroRecreativo = centroRecreativo;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
