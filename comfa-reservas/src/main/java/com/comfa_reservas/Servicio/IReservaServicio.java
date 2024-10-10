package com.comfa_reservas.Servicio;

import com.comfa_reservas.Modelo.Reserva;
import com.comfa_reservas.Modelo.Usuario;

import java.util.List;

public interface IReservaServicio {
    Reserva save(Reserva reserva);
    List<Reserva> findAll();
    Reserva findById(Integer id);
    void deleteById (Integer id);
    Reserva update(Reserva reserva);
}
