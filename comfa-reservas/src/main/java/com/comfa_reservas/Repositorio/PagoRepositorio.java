package com.comfa_reservas.Repositorio;

import com.comfa_reservas.Modelo.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepositorio extends JpaRepository<Pago,Integer> {
}
