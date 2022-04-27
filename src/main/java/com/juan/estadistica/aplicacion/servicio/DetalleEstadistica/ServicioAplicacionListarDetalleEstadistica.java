package com.juan.estadistica.aplicacion.servicio.DetalleEstadistica;

import com.juan.estadistica.dominio.modelo.DetalleEstadistica;
import com.juan.estadistica.dominio.modelo.Jugador;
import com.juan.estadistica.dominio.puerto.RepositorioDetalleEstadistica;
import com.juan.estadistica.dominio.puerto.RepositorioJugador;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarDetalleEstadistica {

    private final RepositorioDetalleEstadistica repositorioDetalleEstadistica;

    public ServicioAplicacionListarDetalleEstadistica(RepositorioDetalleEstadistica repositorioDetalleEstadistica) {
        this.repositorioDetalleEstadistica = repositorioDetalleEstadistica;
    }

    public List<DetalleEstadistica> ejecutar() {
        return this.repositorioDetalleEstadistica.listar();
    }

    public DetalleEstadistica consultar(Long id) {return this.repositorioDetalleEstadistica.consultarPorId(id);}
}
