package com.juan.estadistica.dominio.puerto;

import com.juan.estadistica.dominio.modelo.Jugador;

import java.util.List;

public interface RepositorioJugador {

    List<Jugador> listar();
    Jugador consultarPorId(Long id);
    Long guardar(Jugador persona);
    boolean existe(Jugador persona);
}
