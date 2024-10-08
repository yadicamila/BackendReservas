package com.comfa_reservas.Servicio.Implementaciones;

import com.comfa_reservas.Modelo.Categoria;
import com.comfa_reservas.Modelo.CentroRecreativo;
import com.comfa_reservas.Repositorio.CategoriaRepositorio;
import com.comfa_reservas.Repositorio.CentroRecreativoRepositorio;
import com.comfa_reservas.Servicio.ICentroRecreativoServicio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CentroRecreativoServicio implements ICentroRecreativoServicio {
    private final CentroRecreativoRepositorio centroRecreativoRepositorio;

    public CentroRecreativoServicio(CentroRecreativoRepositorio centroRecreativoRepositorio) {
        this.centroRecreativoRepositorio = centroRecreativoRepositorio;
    }

    public List<CentroRecreativo> findAll() {
        return centroRecreativoRepositorio.findAll();
    }

    public CentroRecreativo findById(Integer id) {
        return centroRecreativoRepositorio.findById(id).get();

    }




}
