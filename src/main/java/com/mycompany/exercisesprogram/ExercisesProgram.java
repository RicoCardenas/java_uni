/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercisesprogram;

import java.util.Scanner;

/**
 * Clase principal que ejecuta los ejercicios del programa.
 * Contiene el método main que es el punto de entrada de la aplicación.
 * 
 * @autor julian
 */

public class ExercisesProgram {

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * Crea instancias de las clases Register y Numbers y llama a sus métodos.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("Que ejercicio quieres mirar?");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Tablas de multiplicar");
            System.out.println("0. Salir");
            
            System.out.println("Seleccion la opcion");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ejercicio 1");
                    // Crea una instancia de la clase Numbers y llama a su método numbers
                    Numbers ejercicio1 = new Numbers();
                    ejercicio1.numbers();
                    break;
                case 2:
                    // Crea una instancia de la clase Register y llama a su método register
                    Register ejercicio2 = new Register();
                    ejercicio2.register();
                    break;
                case 3:
                    ContarNumeros ejercicio3 = new ContarNumeros();
                    ejercicio3.contar();
                    break;
                case 4:
                    Notas ejercicio4 = new Notas();
                    ejercicio4.notas();
                    break;
                case 5:
                    TablasMultiplicar ejercicio5 = new TablasMultiplicar();
                    ejercicio5.tablas();
                    break;
                case 0:
                    System.out.println("Muchas Gracias");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            }while(opcion != 0);
        sc.close();
    }
}
