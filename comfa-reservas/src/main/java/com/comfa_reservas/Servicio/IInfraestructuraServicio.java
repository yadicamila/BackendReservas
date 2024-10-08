package com.comfa_reservas.Servicio;



import com.comfa_reservas.Modelo.Infraestructura;

import java.util.List;

public interface IInfraestructuraServicio {
    List<Infraestructura> findAll();
    Infraestructura findById(Integer id);
}
