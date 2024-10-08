package com.comfa_reservas.Servicio.Implementaciones;

import com.comfa_reservas.Modelo.Pago;
import com.comfa_reservas.Modelo.Reserva;
import com.comfa_reservas.Repositorio.PagoRepositorio;
import com.comfa_reservas.Servicio.IPagoServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoServicio implements IPagoServicio {

    private final PagoRepositorio pagoRepositorio;

    public PagoServicio(PagoRepositorio pagoRepositorio) {
        this.pagoRepositorio = pagoRepositorio;
    }
    public Pago save(Pago pago) {
        return  pagoRepositorio.save(pago);
    }

    public List<Pago> findAll() {
        return pagoRepositorio.findAll();
    }
}
