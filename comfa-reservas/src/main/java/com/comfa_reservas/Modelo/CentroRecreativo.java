package com.comfa_reservas.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class CentroRecreativo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idCentro;
        private String nombre;
        private String ubicacion; // Popayán, Santander, etc.

        @OneToMany(mappedBy = "centroRecreativo")
        private List<Infraestructura> infraestructuras;

        // Getters y Setters

        public CentroRecreativo() {
        }

        public CentroRecreativo(Integer idCentro, String nombre, String ubicacion, List<Infraestructura> infraestructuras) {
                this.idCentro = idCentro;
                this.nombre = nombre;
                this.ubicacion = ubicacion;
                this.infraestructuras = infraestructuras;
        }

        public Integer getIdCentro() {
                return idCentro;
        }

        public void setIdCentro(Integer idCentro) {
                this.idCentro = idCentro;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getUbicacion() {
                return ubicacion;
        }

        public void setUbicacion(String ubicacion) {
                this.ubicacion = ubicacion;
        }

        public List<Infraestructura> getInfraestructuras() {
                return infraestructuras;
        }

        public void setInfraestructuras(List<Infraestructura> infraestructuras) {
                this.infraestructuras = infraestructuras;
        }
}

