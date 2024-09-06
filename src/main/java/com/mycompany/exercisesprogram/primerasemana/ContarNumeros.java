package com.mycompany.exercisesprogram.primerasemana;

import java.util.Scanner;

public class ContarNumeros {

    public void contar(){
    Scanner sc = new Scanner(System.in);

    float[] numeros = new float[10];

    int i;

    for (i = 0; i < numeros.length; i++){
        System.out.println("Ingrese el " + (i + 1) + " numero: ");
        numeros[i] = sc.nextFloat();
    }

    for (i = 0; i < numeros.length; i++){
        int seRepite = 0;
        for (int j = 0; j < numeros.length; j++){
            if (numeros[i] == numeros[j]){
                seRepite++;
            }
        }
        System.out.println("El numero " + numeros[i] + " se repite " + seRepite + " veces");
    }
}
}

