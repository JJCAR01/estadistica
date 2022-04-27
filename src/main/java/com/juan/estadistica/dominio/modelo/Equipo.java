package com.juan.estadistica.dominio.modelo;

import java.util.List;

public class Equipo {

    private final String nombre;
    private final String categoria;
    private static List<Jugador> jugadores;

    public static Equipo of(String nombre, String categoria){
        validarObligatorio((nombre),"El nombre no puede ser vacío");
        validarObligatorio((categoria),"La categoria no puede ser vacío");
        validarObligatorio(String.valueOf(jugadores),"La lista de jugadores no puede ser vacío");

        return new Equipo(nombre,categoria,jugadores);
    }

    public Equipo(String nombre, String categoria, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.jugadores = jugadores;
    }

    private static void validarObligatorio(String valor, String mensaje) {
        if(valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getNombre() {return nombre;}

    public String getCategoria() {return categoria;}

    public List<Jugador> getJugadores() {return jugadores;}
}
