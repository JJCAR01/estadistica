package com.juan.estadistica.aplicacion.servicio.Equipo;

import com.juan.estadistica.dominio.modelo.Equipo;
import com.juan.estadistica.dominio.modelo.Jugador;
import com.juan.estadistica.dominio.puerto.RepositorioEquipo;

import java.util.List;

public class ServicioAplicacionListarEquipo {

    private final RepositorioEquipo repositorioEquipo;

    public ServicioAplicacionListarEquipo(RepositorioEquipo repositorioEquipo) {
        this.repositorioEquipo = repositorioEquipo;
    }

    public List<Equipo> ejecutar() {
        return this.repositorioEquipo.listar();
    }

    public Equipo consultar(Long id) {return this.repositorioEquipo.consultarPorId(id);}
}
