package com.juan.estadistica.dominio.Utilitario;

import java.util.List;

public class ValidacionObjeto {

    public static void listaEsNulaOVacia(List lista, String mensaje){
        if(lista == null || lista.isEmpty()){
            throw new IllegalArgumentException(mensaje);
        }
    }
}
