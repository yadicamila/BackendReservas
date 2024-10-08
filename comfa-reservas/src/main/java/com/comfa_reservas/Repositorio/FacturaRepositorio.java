package com.comfa_reservas.Repositorio;

import com.comfa_reservas.Modelo.Factura;
import com.comfa_reservas.Modelo.Infraestructura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepositorio extends JpaRepository<Factura,Integer> {
}
