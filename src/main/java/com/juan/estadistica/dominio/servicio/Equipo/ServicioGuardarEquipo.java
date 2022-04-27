package com.juan.estadistica.dominio.servicio.Equipo;

import com.juan.estadistica.dominio.modelo.Equipo;
import com.juan.estadistica.dominio.modelo.Jugador;
import com.juan.estadistica.dominio.puerto.RepositorioEquipo;
import com.juan.estadistica.dominio.puerto.RepositorioJugador;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarEquipo {

    private static final String MENSAJE_YA_EXISTE = "Ya existe el equipo con los datos ingresados";

    private final RepositorioEquipo repositorioEquipo;

    public ServicioGuardarEquipo(RepositorioEquipo repositorioEquipo) {
        this.repositorioEquipo = repositorioEquipo;
    }

    public Long ejecutar(Equipo equipo) {

        if(this.repositorioEquipo.existe(equipo)) {
            throw new IllegalStateException(MENSAJE_YA_EXISTE);
        }
        return this.repositorioEquipo.guardar(equipo);
    }
}
