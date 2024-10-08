package com.comfa_reservas.Servicio.Implementaciones;

import com.comfa_reservas.Modelo.Usuario;
import com.comfa_reservas.Repositorio.UsuarioRepositorio;
import com.comfa_reservas.Servicio.IUsuarioServicio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServicio implements IUsuarioServicio {

    private final  UsuarioRepositorio usuarioRepositorio;
    

    public UsuarioServicio(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }


    public Usuario save(Usuario usuario) {
        return  usuarioRepositorio.save(usuario);
    }

    public List<Usuario> findAll() {
        return usuarioRepositorio.findAll();
    }


}
