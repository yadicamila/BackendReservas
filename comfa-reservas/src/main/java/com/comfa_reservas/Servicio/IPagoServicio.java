package com.comfa_reservas.Servicio;


import com.comfa_reservas.Modelo.Pago;

import java.util.List;

public interface IPagoServicio {
    Pago save(Pago pago);
    List<Pago> findAll();
}
