package com.juan.estadistica.dominio.modelo;

import com.juan.estadistica.aplicacion.dto.DtoEquipo;
import com.juan.estadistica.dominio.Utilitario.ValidacionTexto;

import java.util.Date;

public class Estadistica {

    private final Date fecha;
    private final int jornada;

    private Equipo equipo;

    public static Estadistica of(Date fecha, int jornada, Equipo equipo){
        ValidacionTexto.validarObligatorio(String.valueOf(fecha),"La fecha no puede ser vacío");
        ValidacionTexto.validarObligatorio(String.valueOf(jornada),"La jornada no puede ser vacío");
        ValidacionTexto.validarObligatorio  (String.valueOf(equipo),"El equipo no puede ser vacío");

        return new Estadistica(fecha,jornada,equipo);
    }

    public Estadistica(Date fecha, int jornada, Equipo equipo) {
        this.fecha = fecha;
        this.jornada = jornada;
        this.equipo = equipo;
    }

    public Date getFecha() {return fecha;}

    public int getJornada() {return jornada;}

    public Equipo getEquipo() {return equipo;}
}
