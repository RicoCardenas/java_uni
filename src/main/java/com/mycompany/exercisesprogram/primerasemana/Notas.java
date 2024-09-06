package com.mycompany.exercisesprogram.primerasemana;

import java.util.Scanner;

public class Notas {
    
    public void notas(){
        Scanner sc = new Scanner(System.in);
        int filas = 5; // Número de alumnos
        int columnas = 4; // Tres notas y un promedio
        double[][] notas = new double[filas][columnas];

        // Leer las notas de los alumnos
        for (int i = 0; i < filas; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
            double suma = 0;
            for (int j = 0; j < columnas - 1; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
                suma += notas[i][j];
            }
            // Calcular el promedio y almacenarlo en la última columna
            notas[i][columnas - 1] = suma / (columnas - 1);
        }

        // Mostrar las notas y los promedios
        System.out.println("\nNotas y promedios de los alumnos:");
        for (int i = 0; i < filas; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < columnas; j++) {
                if (j == columnas - 1) {
                    System.out.print("Promedio: " + notas[i][j]);
                } else {
                    System.out.print(notas[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
