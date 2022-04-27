package com.juan.estadistica.infraestructura.testdatabuilder;

import com.juan.estadistica.aplicacion.dto.DtoJugador;

public class DtoJugadorTestDataBuilder {

    private String nombre;
    private String numeroIdentificacion;
    private byte dorsal;

    public DtoJugadorTestDataBuilder() {
        this.nombre = "Juan";
        this.numeroIdentificacion = "1289231929";
        this.dorsal = 4;
    }

    public DtoJugadorTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DtoJugadorTestDataBuilder conNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
        return this;
    }
    public DtoJugadorTestDataBuilder conDorsal(byte dorsal) {
        this.dorsal = dorsal;
        return this;
    }

    public DtoJugador build(){return new DtoJugador(nombre,numeroIdentificacion,dorsal);}
}
