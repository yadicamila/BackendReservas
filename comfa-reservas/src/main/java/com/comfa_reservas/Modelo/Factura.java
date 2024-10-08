package com.comfa_reservas.Modelo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
@Entity
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFactura;

    private LocalDate fechaEmision;
    private double montoTotal;
    private double descuento;

    @OneToOne
    @JoinColumn(name = "reserva_id")
    @JsonIgnore
    private Reserva reserva;

    // Constructor, Getters y Setters

    public Factura() {
    }

    public Factura(Integer idFactura, LocalDate fechaEmision, double montoTotal, double descuento, Reserva reserva) {
        this.idFactura = idFactura;
        this.fechaEmision = fechaEmision;
        this.montoTotal = montoTotal;
        this.descuento = descuento;
        this.reserva = reserva;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
