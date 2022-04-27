package com.juan.estadistica.aplicacion.servicio.Equipo;

import com.juan.estadistica.aplicacion.dto.DtoRespuesta;
import com.juan.estadistica.dominio.servicio.Equipo.ServicioEliminarEquipo;
import com.juan.estadistica.dominio.servicio.Jugador.ServicioEliminarJugador;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionEliminarEquipo {

    private final ServicioEliminarEquipo servicioEliminarEquipo;

    public ServicioAplicacionEliminarEquipo(ServicioEliminarEquipo servicioEliminarEquipo) {
        this.servicioEliminarEquipo = servicioEliminarEquipo;
    }

    public DtoRespuesta<Long> ejecutar(long codigo) {

        return new DtoRespuesta<>(this.servicioEliminarEquipo.ejecutar(codigo));
    }
}
