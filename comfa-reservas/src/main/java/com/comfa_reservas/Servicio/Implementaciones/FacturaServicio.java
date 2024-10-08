package com.comfa_reservas.Servicio.Implementaciones;

import com.comfa_reservas.Modelo.CentroRecreativo;
import com.comfa_reservas.Modelo.Factura;
import com.comfa_reservas.Modelo.Reserva;
import com.comfa_reservas.Repositorio.FacturaRepositorio;
import com.comfa_reservas.Repositorio.ReservaRepositorio;
import com.comfa_reservas.Servicio.IFacturaServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServicio implements IFacturaServicio {
    private final FacturaRepositorio facturaRepositorio;

    public FacturaServicio(FacturaRepositorio facturaRepositorio) {
        this.facturaRepositorio = facturaRepositorio;
    }

    public Factura save(Factura factura) {
        return  facturaRepositorio.save(factura);
    }

    public List<Factura> findAll() {
        return facturaRepositorio.findAll();
    }
    public Factura findById(Integer id) {
        return facturaRepositorio.findById(id).get();

    }

}
