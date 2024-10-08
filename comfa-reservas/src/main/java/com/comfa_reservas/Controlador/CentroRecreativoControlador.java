package com.comfa_reservas.Controlador;

import com.comfa_reservas.Modelo.Categoria;
import com.comfa_reservas.Modelo.CentroRecreativo;
import com.comfa_reservas.Servicio.Implementaciones.CategoriaServicio;
import com.comfa_reservas.Servicio.Implementaciones.CentroRecreativoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/centros")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class CentroRecreativoControlador {
    private final CentroRecreativoServicio centroRecreativoServicio;

    public CentroRecreativoControlador(CentroRecreativoServicio centroRecreativoServicio) {
        this.centroRecreativoServicio = centroRecreativoServicio;
    }

    //http:localhost:8080/api/centros
    @GetMapping
    public List<CentroRecreativo> findAll() {
        return centroRecreativoServicio.findAll();
    }
    //http:localhost:8080/api/centros/1
    @GetMapping("/{id}")
    public CentroRecreativo findById(@PathVariable Integer id){
        return centroRecreativoServicio.findById(id);
    }

}
