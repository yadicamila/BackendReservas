package com.comfa_reservas.Servicio;

import com.comfa_reservas.Modelo.Categoria;
import com.comfa_reservas.Modelo.CentroRecreativo;

import java.util.List;

public interface ICentroRecreativoServicio {
    List<CentroRecreativo> findAll();
    CentroRecreativo findById(Integer id);
}
