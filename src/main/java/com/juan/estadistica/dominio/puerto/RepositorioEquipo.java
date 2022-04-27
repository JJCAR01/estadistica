package com.juan.estadistica.dominio.puerto;

import com.juan.estadistica.dominio.modelo.Equipo;

import java.util.List;

public interface RepositorioEquipo {

    List<Equipo> listar();
    Equipo consultarPorId(Long id);
    Long guardar(Equipo equipo);
    boolean existe(Equipo persona);
}
