package com.comfa_reservas.Controlador;

import com.comfa_reservas.Modelo.CentroRecreativo;
import com.comfa_reservas.Modelo.Factura;
import com.comfa_reservas.Modelo.Reserva;
import com.comfa_reservas.Servicio.Implementaciones.FacturaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/facturas")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class FacturaControlador {
    private final FacturaServicio facturaServicio;

    public FacturaControlador(FacturaServicio facturaServicio) {
        this.facturaServicio = facturaServicio;
    }
    //http:localhost:8080/api/facturas
    @PostMapping
    public Factura save(@RequestBody Factura factura) {
        return facturaServicio.save(factura);
    }

    //http:localhost:8080/api/facturas
    @GetMapping
    public List<Factura> findAll() {
        return facturaServicio.findAll();
    }

    //http:localhost:8080/api/facturas/1
    @GetMapping("/{id}")
    public Factura findById(@PathVariable Integer id){
        return facturaServicio.findById(id);
    }

}
