package com.mycompany.exercisesprogram.TerceraSemana;

import java.util.List;

public class Modelos {
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
            int ultimoDigito = Character.getNumericValue(documento.charAt(documento.length() - 1));
            int modelo = asignarModelo(ultimoDigito);
            conteos[modelo - 1]++; // Incrementa el contador correspondiente
        }

        return conteos;
    }
}
