package com.comfa_reservas.Controlador;

import com.comfa_reservas.Modelo.Categoria;
import com.comfa_reservas.Modelo.Usuario;
import com.comfa_reservas.Servicio.Implementaciones.CategoriaServicio;
import com.comfa_reservas.Servicio.Implementaciones.UsuarioServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/categorias")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class CategoriaControlador {
    private final CategoriaServicio categoriaServicio;

    public CategoriaControlador(CategoriaServicio categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    //http:localhost:8080/api/categorias
    @PostMapping
    public Categoria save(@RequestBody Categoria categoria) {
        return categoriaServicio.save(categoria);
    }

    //http:localhost:8080/api/categorias
    @GetMapping
    public List<Categoria> findAll() {
        return categoriaServicio.findAll();
    }
}
