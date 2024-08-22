package com.mycompany.exercisesprogram.SegundaSemana.Ejercicios;

import java.util.*;

public class EjecutarEjercicios {
    public static void main(String[] args) {

        // Crear un objeto de la clase Scanner
        Scanner teclado = new Scanner(System.in);

        // Variable para almacenar la opción del usuario
        int opcion = 0;

        // Menú de opciones
        do {
            System.out.println("Que desea ver: ");
            System.out.println("1. Operaciones Simples");
            System.out.println("2. Ejercicio notas");
            System.out.println("3. Ejercicio Estaturas");
            System.out.println("0. Salir");

            opcion = teclado.nextInt();

            // Switch para seleccionar la opción
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    int numero1 = teclado.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    int numero2 = teclado.nextInt();
                    OperacionesSimples op = new OperacionesSimples(numero1, numero2);
                    int opcionOperaciones = 0;
                    
                    // Menú de opciones para las operaciones
                    do {
                        System.out.println("Que desea realizar con los 2 numeros ingresados?");
                        System.out.println("1. Sumar");
                        System.out.println("2. Restar");
                        System.out.println("3. Multiplicar");
                        System.out.println("4. Dividir");
                        System.out.println("0. Salir");

                        opcionOperaciones = teclado.nextInt();

                        switch (opcionOperaciones) {
                            case 1:
                                op.suma();
                                break;
                            case 2:
                                op.resta();
                                break;
                            case 3:
                                op.multiplicar();
                                break;
                            case 4:
                                op.dividir();
                                break;
                            case 0:
                                System.out.println("Gracias por usar");
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    } while (opcionOperaciones != 0);
                
                break;
                case 2:
                // Ejercicio de notas
                    NotasEstudiantes ej = new NotasEstudiantes();

                    int tamanoNotas = ej.getTamanoNotas();
                
                    for (int i = 0; i < tamanoNotas; i++) {
                        System.out.println("Ingrese la nota " + (i + 1) + ":");
                        float nota = teclado.nextFloat();
                        ej.agregarNota(i, nota);
                    }
                
                    ej.encontrarNotas();
                    ej.calcularTotal();
                    ej.calcularPorcentajes();
                    break;
                case 3:
                    // Ejercicio de estaturas
                    EstaturasEstudiantes ej2 = new EstaturasEstudiantes();

                    int tamanoEstaturas = ej2.getTamanoEstaturas();

                    for (int i = 0; i < tamanoEstaturas; i++) {
                        System.out.println("Ingrese la estatura " + (i + 1) + ":");
                        double estatura = teclado.nextDouble();
                        ej2.agregarEstatura(i, estatura);
                    }
                    ej2.estaturaMasAlta();
                    ej2.estaturaMasBaja();
                    break;
                case 0:
                    System.out.println("Gracias por usar");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 0);
    }
}
