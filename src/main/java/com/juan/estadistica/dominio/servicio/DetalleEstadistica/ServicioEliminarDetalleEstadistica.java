package com.juan.estadistica.dominio.servicio.DetalleEstadistica;

import com.juan.estadistica.dominio.puerto.RepositorioDetalleEstadistica;
import com.juan.estadistica.dominio.puerto.RepositorioJugador;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarDetalleEstadistica {

    private static final String MENSAJE_NO_EXISTE = "No existe el detalle estadistica con los datos ingresados";

    private final RepositorioDetalleEstadistica repositorioDetalleEstadistica;

    public ServicioEliminarDetalleEstadistica(RepositorioDetalleEstadistica repositorioDetalleEstadistica) {
        this.repositorioDetalleEstadistica = repositorioDetalleEstadistica;
    }

    public Long ejecutar(Long codigo) {

        if(this.repositorioDetalleEstadistica.consultarPorId(codigo) == null) {
            throw new IllegalStateException(MENSAJE_NO_EXISTE);
        }

        return this.repositorioDetalleEstadistica.eliminar(codigo);
    }
}
