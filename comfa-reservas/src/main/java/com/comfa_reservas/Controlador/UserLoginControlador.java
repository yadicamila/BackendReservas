package com.comfa_reservas.Controlador;

import com.comfa_reservas.Modelo.UserLogin;
import com.comfa_reservas.Servicio.Implementaciones.UserLoginServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/users")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UserLoginControlador {
    private static final Logger logger =
            LoggerFactory.getLogger(UserLoginControlador.class);

    @Autowired
    private UserLoginServicio UserLoginServicio;

    //http://locahost:8080/api/users
    @GetMapping
    public List<UserLogin> obteneruserlogin(){
        List<UserLogin> userlogin = this.UserLoginServicio.ListarUserLogin();
        logger.info("users  obtenidos:");
        userlogin.forEach((userLogin -> logger.info(userLogin.toString())));
        return userlogin;
    }

    @PostMapping("/login")
    public ResponseEntity<UserLogin> login(@RequestBody UserLogin userLogin) {
        logger.info("Intentando iniciar sesión con usuario: " +  userLogin.getUsuario()) ;
        UserLogin resultado = this.UserLoginServicio.login(userLogin.getUsuario(), userLogin.getContrasena());
        if (resultado != null) {
            logger.info("Inicio de sesión exitoso para el usuario: " + userLogin.getUsuario());
            return ResponseEntity.ok(resultado);
        } else {
            logger.info("Falló el inicio de sesión para el usuario: " + userLogin.getUsuario());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
