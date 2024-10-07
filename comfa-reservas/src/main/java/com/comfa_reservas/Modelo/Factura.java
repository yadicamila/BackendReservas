package com.comfa_reservas.Modelo;

import java.time.LocalDate;
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
    private Reserva reserva;

    // Constructor, Getters y Setters
}
