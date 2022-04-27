package com.juan.estadistica.dominio.puerto;

import com.juan.estadistica.dominio.modelo.Estadistica;
import com.juan.estadistica.dominio.modelo.Jugador;

import java.util.List;

public interface RepositorioEstadistica {

    List<Estadistica> listar();
    Estadistica consultarPorId(Long id);
    Long guardar(Estadistica estadistica);
    boolean existe(Estadistica estadistica);
    Long eliminar(Long Id);
    Long modificar(Estadistica estadistica, Long Id);
}
