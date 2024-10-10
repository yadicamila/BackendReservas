package com.comfa_reservas.Repositorio;

import com.comfa_reservas.Modelo.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepositorio extends JpaRepository<UserLogin, Integer> {
    UserLogin findByUsuarioAndContrasena(String usuario, String contrasena);
}
