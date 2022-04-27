package com.juan.estadistica.aplicacion.servicio.DetalleEstadistica;

import com.juan.estadistica.aplicacion.dto.DtoRespuesta;
import com.juan.estadistica.dominio.servicio.DetalleEstadistica.ServicioEliminarDetalleEstadistica;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionEliminarDetalleEstadistica {

    private final ServicioEliminarDetalleEstadistica servicioEliminarDetalleEstadistica;

    public ServicioAplicacionEliminarDetalleEstadistica(ServicioEliminarDetalleEstadistica servicioEliminarDetalleEstadistica) {
        this.servicioEliminarDetalleEstadistica = servicioEliminarDetalleEstadistica;
    }

    public DtoRespuesta<Long> ejecutar(long codigo) {

        return new DtoRespuesta<>(this.servicioEliminarDetalleEstadistica.ejecutar(codigo));
    }
}
