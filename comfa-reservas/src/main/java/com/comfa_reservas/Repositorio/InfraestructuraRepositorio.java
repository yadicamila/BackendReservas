package com.comfa_reservas.Repositorio;
import com.comfa_reservas.Modelo.Infraestructura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfraestructuraRepositorio extends JpaRepository<Infraestructura,Integer> {
}
