package com.juan.estadistica.dominio.servicio.Equipo;

import com.juan.estadistica.dominio.puerto.RepositorioEquipo;
import com.juan.estadistica.dominio.puerto.RepositorioJugador;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarEquipo {

    private static final String MENSAJE_NO_EXISTE = "No existe el equipo con los datos ingresados";

    private final RepositorioEquipo repositorioEquipo;

    public ServicioEliminarEquipo(RepositorioEquipo repositorioEquipo) {
        this.repositorioEquipo = repositorioEquipo;
    }

    public Long ejecutar(Long codigo) {

        if(this.repositorioEquipo.consultarPorId(codigo) == null) {
            throw new IllegalStateException(MENSAJE_NO_EXISTE);
        }

        return this.repositorioEquipo.eliminar(codigo);
    }
}
