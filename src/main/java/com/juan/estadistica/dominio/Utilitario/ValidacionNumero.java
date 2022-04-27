package com.juan.estadistica.dominio.Utilitario;

public class ValidacionNumero {

    public static void numeroMenorOIgualAUno(int numero, String mensaje) {
        if(numero < 1){
            throw new IllegalArgumentException(mensaje);
        }
    }
}
