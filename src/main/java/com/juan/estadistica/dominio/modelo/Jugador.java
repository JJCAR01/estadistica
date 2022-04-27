package com.juan.estadistica.dominio.modelo;

import com.juan.estadistica.aplicacion.dto.DtoJugador;
import com.juan.estadistica.dominio.Utilitario.ValidacionNumero;
import com.juan.estadistica.dominio.Utilitario.ValidacionTexto;

import java.util.List;

public class Jugador {

    private final String nombre;
    private final String apellido;
    private final String numeroIdentificacion;
    private final byte dorsal;

    public static Jugador of(String nombre,String apellido,String numeroIdentificacion, byte dorsal){
        ValidacionTexto.validarObligatorio(nombre,"El Nombre no puede ser vacío");
        ValidacionTexto.validarObligatorio(apellido,"El apellido no puede ser vacio");
        ValidacionTexto.validarObligatorio(numeroIdentificacion,"El numero de Identificacion no puede ser vacío");
        ValidacionTexto.validarObligatorio(String.valueOf(dorsal),"El dorsal no puede ser vacío");
        ValidacionNumero.numeroMenorOIgualAUno(dorsal,"El dorsal debe de ser mayor a uno");

        return new Jugador(nombre,apellido,numeroIdentificacion,dorsal);
    }

    public Jugador(String nombre,String apellido, String numeroIdentificacion, byte dorsal) {
        this.nombre= nombre;
        this.apellido= apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.dorsal = dorsal;
    }

    public String getNombre() {return nombre;}

    public String getApellido() {return apellido;}

    public String getNumeroIdentificacion() { return numeroIdentificacion; }

    public byte getDorsal() { return dorsal; }
}
