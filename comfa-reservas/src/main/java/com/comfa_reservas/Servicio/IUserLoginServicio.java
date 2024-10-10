package com.comfa_reservas.Servicio;

import com.comfa_reservas.Modelo.UserLogin;

import java.util.List;

public interface IUserLoginServicio {
    public List<UserLogin> ListarUserLogin();

    public UserLogin login(String usuario, String contrasena);
}
