package com.comfa_reservas.Repositorio;

import com.comfa_reservas.Modelo.Categoria;
import com.comfa_reservas.Modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<Categoria,Integer> {
}
