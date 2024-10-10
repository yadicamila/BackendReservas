package com.comfa_reservas.Servicio.Implementaciones;

import com.comfa_reservas.Modelo.Categoria;
import com.comfa_reservas.Modelo.Usuario;
import com.comfa_reservas.Repositorio.CategoriaRepositorio;
import com.comfa_reservas.Repositorio.UsuarioRepositorio;
import com.comfa_reservas.Servicio.IUsuarioServicio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServicio implements IUsuarioServicio {

    private final  UsuarioRepositorio usuarioRepositorio;
    private final CategoriaRepositorio categoriaRepositorio;

    public UsuarioServicio(UsuarioRepositorio usuarioRepositorio, CategoriaRepositorio categoriaRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
        this.categoriaRepositorio = categoriaRepositorio;
    }

    public Usuario save(Usuario usuario) {
        // Buscar la categoría por el idCategoria que viene en el JSON
        Categoria categoria = categoriaRepositorio.findById(usuario.getCategoria().getIdCategoria())
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));

        // Asociar la categoría completa al usuario
        usuario.setCategoria(categoria);

        // Guardar el usuario con la categoría completa
        return usuarioRepositorio.save(usuario);
    }

    public List<Usuario> findAll() {
        return usuarioRepositorio.findAll();
    }


}
