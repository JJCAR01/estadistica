package com.juan.estadistica.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DtoEquipo {

    private String nombre;
    private String categoria;

    private List<DtoJugador> jugadores;


}
