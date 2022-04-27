package com.juan.estadistica.dominio.Utilitario;

public class ValidacionTexto {

    public static void validarObligatorio(String valor, String mensaje) {
        if(valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }
}
