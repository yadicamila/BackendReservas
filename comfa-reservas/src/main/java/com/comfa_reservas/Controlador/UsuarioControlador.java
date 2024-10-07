package com.comfa_reservas.Controlador;

import com.comfa_reservas.Modelo.Usuario;
import com.comfa_reservas.Servicio.Implementaciones.UsuarioServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/usuarios")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UsuarioControlador {

    private final UsuarioServicio usuarioServicio;
    public UsuarioControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    //http:localhost:8080/api/usuarios/
    @PostMapping
    public Usuario save(@RequestBody Usuario usuario) {
        return usuarioServicio.save(usuario);
    }

    //http:localhost:8080/api/usuarios
    @GetMapping
    public List<Usuario> findAll() {
        return usuarioServicio.findAll();
    }
}
