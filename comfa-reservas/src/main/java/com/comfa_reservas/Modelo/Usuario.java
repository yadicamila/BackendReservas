package com.comfa_reservas.Modelo;

import jakarta.persistence.Entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    private String nombre;
    private String apellido;
    //@Column(unique = true, nullable = false)
    private Integer documento;
    private String tipoUsuario;
    private String direccion;

    private int telefono;
    @ManyToOne
    @JoinColumn(name = "categoria_afiliacion_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "usuario")
    private List<Reserva> reservas;
}
