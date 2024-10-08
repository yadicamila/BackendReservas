package com.comfa_reservas.Repositorio;

import com.comfa_reservas.Modelo.Categoria;
import com.comfa_reservas.Modelo.CentroRecreativo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentroRecreativoRepositorio extends JpaRepository<CentroRecreativo,Integer> {
}
