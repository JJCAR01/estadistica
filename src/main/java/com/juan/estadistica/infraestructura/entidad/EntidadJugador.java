package com.juan.estadistica.infraestructura.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "jugador")
public class EntidadJugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private byte dorsal;

    public EntidadJugador(){}

    public EntidadJugador(String nombre,String apellido, String numeroIdentificacion, byte dorsal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.dorsal = dorsal;
    }

}
