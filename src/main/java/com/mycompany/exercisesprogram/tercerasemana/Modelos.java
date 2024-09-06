package com.mycompany.exercisesprogram.tercerasemana;

import java.util.List;

public class Modelos {
    
/**
 * Asigna un modelo basado en el último dígito de un número.
 * 
 * Este método toma un dígito (último dígito de un número) y asigna un modelo
 * basado en reglas predefinidas. Los modelos se asignan de la siguiente manera:
 * - Dígitos 1 y 6 asignan el modelo 1.
 * - Dígitos 2 y 7 asignan el modelo 2.
 * - Dígitos 3 y 8 asignan el modelo 3.
 * - Dígitos 4 y 9 asignan el modelo 4.
 * - Dígitos 5 y 0 asignan el modelo 5.
 * 
 */

    public int asignarModelo(int ultimoDigito) {
        switch (ultimoDigito) {
            case 1:
            case 6:
                return 1;
            case 2:
            case 7:
                return 2;
            case 3:
            case 8:
                return 3;
            case 4:
            case 9:
                return 4;
            case 5:
            case 0:
                return 5;
            default:
                throw new IllegalArgumentException("Dígito inválido");
        }
    }


    public int[] contarModelos(List<String> documentos) {
        int[] conteos = new int[5]; // Array para contar los estudiantes de cada modelo

        for (String documento : documentos) {
            // Obtiene el último dígito del documento
            int ultimoDigito = Character.getNumericValue(documento.charAt(documento.length() - 1));
            // Asigna el modelo basado en el último dígito
            int modelo = asignarModelo(ultimoDigito);
            // Incrementa el contador correspondiente al modelo
            conteos[modelo - 1]++;
        }

        return conteos;
    }
}
