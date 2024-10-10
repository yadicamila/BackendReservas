package com.comfa_reservas.Servicio.Implementaciones;

import com.comfa_reservas.Modelo.UserLogin;
import com.comfa_reservas.Repositorio.UserLoginRepositorio;
import com.comfa_reservas.Servicio.IUserLoginServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginServicio implements IUserLoginServicio {
    @Autowired
    private UserLoginRepositorio UserLoginRepositorio;
    public List<UserLogin> ListarUserLogin() {
        return UserLoginRepositorio.findAll();
    }

    private static final Logger logger = LoggerFactory.getLogger(UserLoginServicio.class);

    @Autowired
    private UserLoginRepositorio userLoginRepositorio;

    public UserLogin login(String usuario, String contrasena) {
        logger.info("Buscando user con usuario: " + usuario);
        UserLogin userLogin = userLoginRepositorio.findByUsuarioAndContrasena(usuario, contrasena);
        if (userLogin != null) {
            logger.info("Encontrado user: " + userLogin.getIdUserLogin());
        } else {
            logger.info("No se encontró user con usuario: " + usuario);
        }
        return userLogin;
    }
}
