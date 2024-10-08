package com.comfa_reservas.Servicio;

import com.comfa_reservas.Modelo.Factura;
import com.comfa_reservas.Modelo.Infraestructura;
import com.comfa_reservas.Modelo.Reserva;

import java.util.List;

public interface IFacturaServicio {
    Factura save(Factura factura);
    List<Factura> findAll();
    Factura findById(Integer id);
}
