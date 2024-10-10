package com.comfa_reservas.Servicio.Implementaciones;

import com.comfa_reservas.Modelo.Factura;
import com.comfa_reservas.Modelo.Infraestructura;
import com.comfa_reservas.Modelo.Reserva;
import com.comfa_reservas.Modelo.Usuario;
import com.comfa_reservas.Repositorio.FacturaRepositorio;
import com.comfa_reservas.Repositorio.InfraestructuraRepositorio;
import com.comfa_reservas.Repositorio.ReservaRepositorio;
import com.comfa_reservas.Repositorio.UsuarioRepositorio;
import com.comfa_reservas.Servicio.IReservaServicio;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservaServicio implements IReservaServicio {
    private final ReservaRepositorio reservaRepositorio;
    //private final InfraestructuraRepositorio infraestructuraRepositorio;
    //private final UsuarioRepositorio usuarioRepositorio;
    //private final FacturaRepositorio facturaRepositorio;


    public ReservaServicio(ReservaRepositorio reservaRepositorio) {
        this.reservaRepositorio = reservaRepositorio;
    }

    public Reserva save(Reserva reserva) {
        return reservaRepositorio.save(reserva);
    }
    public List<Reserva> findAll() {
        return reservaRepositorio.findAll();
    }
    public Reserva findById(Integer id) {
        return reservaRepositorio.findById(id).get();
    }
    public void deleteById(Integer id) {
        reservaRepositorio.deleteById(id);
    }

    public Reserva update(Reserva reserva) {
        return reservaRepositorio.save(reserva);
    }
}
