package com.comfa_reservas.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;

    private String nombre;
    private double porcentajeDescuento;

    @OneToMany(mappedBy = "categoria")
    private List<Usuario> usuarios;

    //Constructor getters and setters
    public Categoria() {
    }

    public Categoria(Integer idCategoria, String nombre, double porcentajeDescuento, List<Usuario> usuarios) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.porcentajeDescuento = porcentajeDescuento;
        this.usuarios = usuarios;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
