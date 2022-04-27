package com.juan.estadistica.dominio.puerto;

import com.juan.estadistica.dominio.modelo.DetalleEstadistica;
import com.juan.estadistica.dominio.modelo.Jugador;

import java.util.List;

public interface RepositorioDetalleEstadistica {

    List<DetalleEstadistica> listar();
    DetalleEstadistica consultarPorId(Long id);
    Long guardar(DetalleEstadistica detalleEstadistica);
    boolean existe(DetalleEstadistica detalleEstadistica);
    Long eliminar(Long Id);
    Long modificar(DetalleEstadistica detalleEstadistica, Long Id);
}
