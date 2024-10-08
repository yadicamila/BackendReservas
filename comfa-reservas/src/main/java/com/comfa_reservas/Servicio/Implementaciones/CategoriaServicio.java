package com.comfa_reservas.Servicio.Implementaciones;

import com.comfa_reservas.Modelo.Categoria;
import com.comfa_reservas.Modelo.Usuario;
import com.comfa_reservas.Repositorio.CategoriaRepositorio;
import com.comfa_reservas.Repositorio.UsuarioRepositorio;
import com.comfa_reservas.Servicio.ICategoriaServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicio implements ICategoriaServicio {
    private final CategoriaRepositorio categoriaRepositorio;

    public CategoriaServicio(CategoriaRepositorio categoriaRepositorio) {
        this.categoriaRepositorio = categoriaRepositorio;
    }

    public Categoria save(Categoria categoria) {
        return  categoriaRepositorio.save(categoria);
    }

    public List<Categoria> findAll() {
        return categoriaRepositorio.findAll();
    }

}
