package com.mycompany.exercisesprogram;

import java.util.*;

public class Register {

    /**
     * Método principal para manejar el registro de usuarios.
     * Este método imprime un menú y permite al usuario seleccionar opciones
     * para agregar usuarios, ver usuarios y verificar si un usuario puede votar.
     */

    public void register() {
        // Imprime el título del registro
        System.out.println("\nREGISTRADURIA");

        // Inicializa el Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Crea un diccionario para almacenar los usuarios y sus edades
        Map<String, Integer> diccionario = new HashMap<>();
        
         // Variable para almacenar la opción seleccionada por el usuario
        int opcion = 0;

        // Bucle principal para mostrar el menú y manejar las opciones
        do {
            System.out.println("1. Agregar un usuario");
            System.out.println("2. Ver usuarios");
            System.out.println("3. Verificar si el usuario puede votar");
            System.out.println("0. Salir");
            System.out.println("\nSeleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            // Maneja la opción seleccionada usando un switch
            switch (opcion) {
                case 1:
                    // agregar un usuario
                    System.out.println("Ingrese su nombre completo:");
                    String nameComplete = sc.nextLine();
                    System.out.println("Ingrese su edad:");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    diccionario.put(nameComplete, edad);
                    break;
                case 2:
                    // ver usuarios
                    System.out.println(diccionario.keySet());
                    break;
                case 3:
                // Verificar si el usuario puede votar
                    System.out.println("Lista de usuarios");
                    System.out.println("-----------------");
                    System.out.println(diccionario.keySet());
                    System.out.println("Ingrese el nombre del usuario:");
                    String name = sc.nextLine();
                    System.out.println("Edad: " + diccionario.get(name));
                    if (diccionario.get(name) >= 18) {
                        System.out.println(name + " usted puede votar");
                    } else {
                        System.out.println(name + " usted no puede votar");
                    }
                    break;
                case 0:
                    // Salir
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 0);

        // Cierra el Scanner
        sc.close();
    }
}
