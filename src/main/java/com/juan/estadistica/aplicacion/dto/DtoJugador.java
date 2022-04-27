package com.juan.estadistica.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DtoJugador {

    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private byte dorsal;
}
