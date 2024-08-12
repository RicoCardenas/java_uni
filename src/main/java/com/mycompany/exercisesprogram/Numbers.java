package com.mycompany.exercisesprogram;

import java.util.*;

public class Numbers {
    public void numbers() {

        Scanner sc = new Scanner(System.in);
        float[] numeros = new float[10];
        int pos = 0, neg = 0, cero = 0;
        int i;

        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextFloat();
        }

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

        sc.close();
    }
}