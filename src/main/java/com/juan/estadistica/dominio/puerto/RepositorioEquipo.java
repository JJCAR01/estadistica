package com.juan.estadistica.dominio.puerto;

import com.juan.estadistica.dominio.modelo.Equipo;
import com.juan.estadistica.dominio.modelo.Jugador;

import java.util.List;

public interface RepositorioEquipo {

    List<Equipo> listar();
    Equipo consultarPorId(Long id);
    Long guardar(Equipo equipo);
    boolean existe(Equipo persona);
    Long eliminar(Long Id);
    Long modificar(Equipo equipo, Long Id);
}
