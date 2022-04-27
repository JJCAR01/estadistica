package com.juan.estadistica.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DtoEstadistica {

    private Date fecha;
    private int jornada;

    private DtoEquipo equipo;
}
