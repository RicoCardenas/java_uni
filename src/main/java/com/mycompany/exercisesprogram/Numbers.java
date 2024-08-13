package com.mycompany.exercisesprogram;

import java.util.*;

public class Numbers {

    /**
     * Método principal para manejar la entrada y clasificación de números.
     * Este método permite al usuario ingresar 10 números y los clasifica
     * como positivos, negativos o ceros.
     */

    public void numbers() {

        // Inicializa el Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Crea un array para almacenar 10 números flotantes
        float[] numeros = new float[10];
        
        // Variables para contar positivos, negativos y ceros
        int pos = 0, neg = 0, cero = 0;
        
        // Variable de control para los bucles
        int i;

        // Lectura de los elementos del array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextFloat();
        }

        // Clasificación de los números en positivos, negativos y ceros
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }

        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }
}