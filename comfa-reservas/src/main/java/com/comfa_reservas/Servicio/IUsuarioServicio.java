package com.comfa_reservas.Servicio;

import com.comfa_reservas.Modelo.Usuario;

import java.util.List;

public interface IUsuarioServicio {
    Usuario save(Usuario usuario);
    List<Usuario> findAll();
    //Usuario findById(Integer id);
    //void deleteById (Integer id);
    //Usuario update(Usuario usuario);
}
