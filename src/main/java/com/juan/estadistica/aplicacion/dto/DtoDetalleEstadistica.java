package com.juan.estadistica.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DtoDetalleEstadistica {

    private int codigo;
    private int tiros;
    private int goles;
    private int asistencias;
    private int balonesPerdidos;
    private int balonesRecuperados;
    private int faltasRecibidas;
    private int faltasOcasionadas;
    private int pases;
    private int minutos;
    
    private DtoEstadistica estadistica;
    private List<DtoJugador> jugadores;


}
