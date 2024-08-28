package com.mycompany.exercisesprogram.TerceraSemana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Notas");
            System.out.println("2. Modelo Parcial");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:            
                    int longitudNotas;

                    System.out.println("Ingrese la cantidad de notas: ");
                    longitudNotas = teclado.nextInt();

                    float totNotas[] = new float[longitudNotas];

                    for (int i = 0; i < longitudNotas; i++) {
                        System.out.println("Ingrese la nota " + (i + 1) + ": ");
                        float nota = teclado.nextFloat();
                        totNotas[i] = nota;
                    }
                
                    Notas calcular = new Notas(totNotas);
                    int porEncima = calcular.getPorEncima();
                    System.out.println("La cantidad de notas por encima del promedio es: " + porEncima);
                    int porDebajo = calcular.getPorDebajo();
                    System.out.println("La cantidad de notas por debajo del promedio es: " + porDebajo);
                    
                    break;
                case 2:
                    Scanner scanner = new Scanner(System.in);
                    List<String> documentos = new ArrayList<>();

                    System.out.println("Ingrese los documentos de los estudiantes (ingrese 'fin' para terminar):");

                    while (true) {
                        String input = scanner.nextLine();
                        if (input.equalsIgnoreCase("fin")) {
                            break;
                        }
                        documentos.add(input);
                    }
                
                    Modelos modelos = new Modelos();
                    int[] conteos = modelos.contarModelos(documentos);
                    System.out.println("Conteo de estudiantes por modelo:");
                    for (int i = 0; i < conteos.length; i++) {
                        System.out.println("Modelo " + (i + 1) + ": " + conteos[i] + " estudiantes");
                    }
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 0);   
    }
}
