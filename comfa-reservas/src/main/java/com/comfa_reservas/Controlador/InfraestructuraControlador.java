package com.comfa_reservas.Controlador;
import com.comfa_reservas.Modelo.Infraestructura;
import com.comfa_reservas.Servicio.Implementaciones.InfraesructuraServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/infraestructuras")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class InfraestructuraControlador {
    private final InfraesructuraServicio infraesructuraServicio;

    public InfraestructuraControlador(InfraesructuraServicio infraesructuraServicio) {
        this.infraesructuraServicio = infraesructuraServicio;
    }

    //http:localhost:8080/api/infraestructuras
    @GetMapping
    public List<Infraestructura> findAll() {
        return infraesructuraServicio.findAll();
    }
    //http:localhost:8080/api/infraestructuras/1
    @GetMapping("/{id}")
    public Infraestructura findById(@PathVariable Integer id){
        return infraesructuraServicio.findById(id);
    }

}
