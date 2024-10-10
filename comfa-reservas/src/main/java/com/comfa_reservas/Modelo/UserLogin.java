package com.comfa_reservas.Modelo;

import jakarta.persistence.*;

@Entity

public class UserLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer IdUserLogin;

    String usuario;
    String contrasena;

    public Integer getIdUserLogin() {
        return IdUserLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}
