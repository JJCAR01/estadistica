package com.juan.estadistica.dominio.modelo;

import com.juan.estadistica.aplicacion.dto.DtoJugador;
import com.juan.estadistica.dominio.Utilitario.ValidacionObjeto;
import com.juan.estadistica.dominio.Utilitario.ValidacionTexto;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private final String nombre;
    private final String categoria;
    private static List<Jugador> jugadores;

    public static Equipo of(String nombre, String categoria, List<Jugador> jugadores){
        ValidacionTexto.validarObligatorio(nombre,"El nombre no puede ser vacío");
        ValidacionTexto.validarObligatorio(categoria,"La categoria no puede ser vacío");
        ValidacionObjeto.listaEsNulaOVacia(Equipo.jugadores,"La lista no puede ser vacia");


        return new Equipo(nombre,categoria, Equipo.jugadores);
    }

    public Equipo(String nombre, String categoria, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.jugadores = new ArrayList<>(jugadores);
    }

    public String getNombre() {return nombre;}

    public String getCategoria() {return categoria;}

    public List<Jugador> getJugadores() {return jugadores;}
}
