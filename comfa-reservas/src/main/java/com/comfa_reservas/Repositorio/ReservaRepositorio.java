package com.comfa_reservas.Repositorio;

import com.comfa_reservas.Modelo.Reserva;
import com.comfa_reservas.Modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepositorio extends JpaRepository<Reserva,Integer> {
}
