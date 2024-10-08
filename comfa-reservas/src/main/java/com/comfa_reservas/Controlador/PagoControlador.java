package com.comfa_reservas.Controlador;

import com.comfa_reservas.Modelo.Pago;
import com.comfa_reservas.Modelo.Reserva;
import com.comfa_reservas.Servicio.Implementaciones.PagoServicio;
import com.comfa_reservas.Servicio.Implementaciones.ReservaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/pagos")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PagoControlador {
    private final PagoServicio pagoServicio;

    public PagoControlador(PagoServicio pagoServicio) {
        this.pagoServicio = pagoServicio;
    }

    //http:localhost:8080/api/pagos
    @PostMapping
    public Pago save(@RequestBody Pago pago) {
        return pagoServicio.save(pago);
    }

    //http:localhost:8080/api/pagos
    @GetMapping
    public List<Pago> findAll() {
        return pagoServicio.findAll();
    }
}
