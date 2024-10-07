package com.comfa_reservas.Servicio.Implementaciones;

import com.comfa_reservas.Modelo.Reserva;
import com.comfa_reservas.Modelo.Usuario;
import com.comfa_reservas.Repositorio.ReservaRepositorio;
import com.comfa_reservas.Repositorio.UsuarioRepositorio;
import com.comfa_reservas.Servicio.IReservaServicio;

import java.util.List;

public class ReservaServicio implements IReservaServicio {
    private final ReservaRepositorio reservaRepositorio;

    public ReservaServicio(ReservaRepositorio reservaRepositorio) {
        this.reservaRepositorio = reservaRepositorio;
    }

    public Reserva save(Reserva reserva) {
        return  reservaRepositorio.save(reserva);
    }

    public List<Reserva> findAll() {
        return reservaRepositorio.findAll();
    }
}
