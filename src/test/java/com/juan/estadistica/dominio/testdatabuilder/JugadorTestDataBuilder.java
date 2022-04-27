package com.juan.estadistica.dominio.testdatabuilder;

import com.juan.estadistica.aplicacion.dto.DtoJugador;
import com.juan.estadistica.dominio.modelo.Jugador;
import com.juan.estadistica.infraestructura.testdatabuilder.DtoJugadorTestDataBuilder;

public class JugadorTestDataBuilder {

    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private byte dorsal;

    public JugadorTestDataBuilder() {
        this.nombre = "Juan";
        this.apellido = "CARDONA";
        this.numeroIdentificacion = "1289231929";
        this.dorsal = 4;
    }

    public JugadorTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public JugadorTestDataBuilder conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public JugadorTestDataBuilder conNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
        return this;
    }
    public JugadorTestDataBuilder conDorsal(byte dorsal) {
        this.dorsal = dorsal;
        return this;
    }


    public Jugador build(){return new Jugador(nombre,apellido,numeroIdentificacion,dorsal);}
}
