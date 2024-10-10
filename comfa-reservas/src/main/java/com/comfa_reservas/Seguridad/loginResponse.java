package com.comfa_reservas.Seguridad;

import com.comfa_reservas.Modelo.UserLogin;

public class loginResponse {
    private String message;
    private UserLogin userLogin;

    public loginResponse(String message, UserLogin userLogin) {
        this.message = message;
        this.userLogin = userLogin;
    }

    // Getters y Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
}
