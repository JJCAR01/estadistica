package com.juan.estadistica.dominio.modelo;

import com.juan.estadistica.dominio.Utilitario.ValidacionTexto;

import java.util.List;

public class DetalleEstadistica {

    private final int tiros;
    private final int goles;
    private final int asistencias;
    private final int balonesPerdidos;
    private final int balonesRecuperados;
    private final int faltasRecibidas;
    private final int faltasOcasionadas;
    private final int pases;
    private final int minutos;

    private Estadistica estadistica;
    private List<Jugador> jugadores;

    public DetalleEstadistica(Integer tiros, Integer goles, Integer asistencias, Integer balonesPerdidos, Integer balonesRecuperados, Integer faltasOcasionadas, Integer faltasRecibidas, Integer pases, Integer minutos) {
        this.tiros = tiros;
        this.goles = goles;
        this.asistencias = asistencias;
        this.balonesPerdidos = balonesPerdidos;
        this.balonesRecuperados = balonesRecuperados;
        this.faltasRecibidas = faltasRecibidas;
        this.faltasOcasionadas = faltasOcasionadas;
        this.pases = pases;
        this.minutos = minutos;
        this.estadistica = estadistica;
        this.jugadores = jugadores;
    }

    public static DetalleEstadistica of(Integer tiros, Integer goles, Integer asistencias, Integer balonesPerdidos, Integer balonesRecuperados, Integer faltasOcasionadas, Integer faltasRecibidas, Integer pases, Integer minutos)
    {
        ValidacionTexto.validarObligatorio(String.valueOf(tiros), "Los tiros no puede ser vacío");
        ValidacionTexto.validarObligatorio(String.valueOf(goles), "Los tiros no puede ser vacío");
        ValidacionTexto.validarObligatorio(String.valueOf(asistencias), "Los tiros no puede ser vacío");
        ValidacionTexto.validarObligatorio(String.valueOf(balonesPerdidos), "Los tiros no puede ser vacío");
        ValidacionTexto.validarObligatorio(String.valueOf(balonesRecuperados), "Los tiros no puede ser vacío");
        ValidacionTexto.validarObligatorio(String.valueOf(faltasRecibidas), "Los tiros no puede ser vacío");
        ValidacionTexto.validarObligatorio(String.valueOf(faltasOcasionadas), "Los tiros no puede ser vacío");
        ValidacionTexto.validarObligatorio(String.valueOf(pases), "Los tiros no puede ser vacío");
        ValidacionTexto.validarObligatorio(String.valueOf(minutos), "Los tiros no puede ser vacío");

        return new DetalleEstadistica(tiros,goles,asistencias,balonesPerdidos,balonesRecuperados,faltasOcasionadas,
                faltasRecibidas,pases,minutos);
    }
    

    public Integer getTiros() {
        return tiros;
    }

    public Integer getGoles() {
        return goles;
    }

    public Integer getAsistencias() {
        return asistencias;
    }

    public Integer getBalonesPerdidos() {
        return balonesPerdidos;
    }

    public Integer getBalonesRecuperados() {
        return balonesRecuperados;
    }

    public Integer getFaltasRecibidas() {
        return faltasRecibidas;
    }

    public Integer getFaltasOcasionadas() {
        return faltasOcasionadas;
    }

    public Integer getPases() {
        return pases;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public Estadistica getEstadistica() {
        return estadistica;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}
