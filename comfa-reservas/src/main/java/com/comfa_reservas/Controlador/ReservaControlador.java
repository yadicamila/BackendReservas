package com.comfa_reservas.Controlador;

import com.comfa_reservas.Modelo.Reserva;
import com.comfa_reservas.Modelo.Usuario;
import com.comfa_reservas.Servicio.Implementaciones.ReservaServicio;
import com.comfa_reservas.Servicio.Implementaciones.UsuarioServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/reservas")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ReservaControlador {
    private final ReservaServicio reservaServicio;

    public ReservaControlador(ReservaServicio reservaServicio) {
        this.reservaServicio = reservaServicio;
    }

    //http:localhost:8080/api/reservas
    @PostMapping
    public Reserva save(@RequestBody Reserva reserva) {
        return reservaServicio.save(reserva);
    }

    //http:localhost:8080/api/reservas
    @GetMapping
    public List<Reserva> findAll() {
        return reservaServicio.findAll();
    }
}
