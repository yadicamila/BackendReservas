package com.comfa_reservas.Servicio;

import com.comfa_reservas.Modelo.Categoria;
import com.comfa_reservas.Modelo.Reserva;

import java.util.List;

public interface ICategoriaServicio {
    Categoria save(Categoria categoria);
    List<Categoria> findAll();
    //Reserva findById(Integer id);
    //void deleteById (Integer id);
    //Reserva update(Reserva reserva);
}
