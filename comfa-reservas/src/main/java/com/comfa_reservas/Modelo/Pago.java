package com.comfa_reservas.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPago;

    private LocalDate fechaPago;
    private double monto;
    private String metodoPago;

    @ManyToOne
    @JoinColumn(name = "factura_id")
    private Factura factura;

    // Constructor, Getters y Setters
}
