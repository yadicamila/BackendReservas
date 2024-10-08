package com.comfa_reservas.Servicio.Implementaciones;

import com.comfa_reservas.Modelo.Infraestructura;
import com.comfa_reservas.Repositorio.InfraestructuraRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfraesructuraServicio {
    private final InfraestructuraRepositorio infraestructuraRepositorio;

    public InfraesructuraServicio(InfraestructuraRepositorio infraestructuraRepositorio) {
        this.infraestructuraRepositorio = infraestructuraRepositorio;
    }

    public List<Infraestructura> findAll() {
        return infraestructuraRepositorio.findAll();
    }

    public Infraestructura findById(Integer id) {
        return infraestructuraRepositorio.findById(id).get();

    }
}
