package com.juan.estadistica.dominio.servicio.DetalleEstadistica;

import com.juan.estadistica.dominio.modelo.DetalleEstadistica;
import com.juan.estadistica.dominio.modelo.Jugador;
import com.juan.estadistica.dominio.puerto.RepositorioDetalleEstadistica;
import com.juan.estadistica.dominio.puerto.RepositorioJugador;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarDetalleEstadistica {

    private static final String MENSAJE_YA_EXISTE = "Ya existe el detalle estadistica con los datos ingresados";

    private final RepositorioDetalleEstadistica repositorioDetalleEstadistica;

    public ServicioGuardarDetalleEstadistica(RepositorioDetalleEstadistica repositorioDetalleEstadistica) {
        this.repositorioDetalleEstadistica = repositorioDetalleEstadistica;
    }

    public Long ejecutar(DetalleEstadistica detalleEstadistica) {

        if(this.repositorioDetalleEstadistica.existe(detalleEstadistica)) {
            throw new IllegalStateException(MENSAJE_YA_EXISTE);
        }
        return this.repositorioDetalleEstadistica.guardar(detalleEstadistica);
    }
}
