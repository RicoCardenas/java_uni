package com.mycompany.exercisesprogram.TerceraSemana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            // Muestra el menú de opciones
            System.out.println("1. Notas");
            System.out.println("2. Modelo Parcial");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    int longitudNotas;

                    // Solicita la cantidad de notas
                    System.out.println("Ingrese la cantidad de notas: ");
                    longitudNotas = teclado.nextInt();

                    float totNotas[] = new float[longitudNotas];

                    // Solicita cada una de las notas
                    for (int i = 0; i < longitudNotas; i++) {
                        System.out.println("Ingrese la nota " + (i + 1) + ": ");
                        float nota = teclado.nextFloat();
                        totNotas[i] = nota;
                    }

                    // Calcula las notas por encima y por debajo del promedio
                    Notas calcular = new Notas(totNotas);
                    int porEncima = calcular.getPorEncima();
                    System.out.println("La cantidad de notas por encima del promedio es: " + porEncima);
                    int porDebajo = calcular.getPorDebajo();
                    System.out.println("La cantidad de notas por debajo del promedio es: " + porDebajo);

                    break;
                case 2:
                    Scanner scanner = new Scanner(System.in);
                    List<String> documentos = new ArrayList<>();

                    // Solicita los documentos de los estudiantes
                    System.out.println("Ingrese los documentos de los estudiantes (ingrese 'fin' para terminar):");

                    while (true) {
                        String input = scanner.nextLine();
                        if (input.equalsIgnoreCase("fin")) {
                            break;
                        }
                        documentos.add(input);
                    }

                    // Cuenta los estudiantes por modelo
                    Modelos modelos = new Modelos();
                    int[] conteos = modelos.contarModelos(documentos);
                    System.out.println("Conteo de estudiantes por modelo:");
                    for (int i = 0; i < conteos.length; i++) {
                        System.out.println("Modelo " + (i + 1) + ": " + conteos[i] + " estudiantes");
                    }
                    break;
                case 0:
                    // Opción para salir del programa
                    System.out.println("Salir");
                    break;
                default:
                    // Mensaje para opción no válida
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 0);   
    }
}
