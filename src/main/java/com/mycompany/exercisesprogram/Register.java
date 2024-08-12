package com.mycompany.exercisesprogram;

import java.util.*;

public class Register {
    public void register() {
        System.out.println("\nREGISTRADURIA");
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> diccionario = new HashMap<>();
        int opcion = 0;

        do {
            System.out.println("1. Agregar un usuario");
            System.out.println("2. Ver usuarios");
            System.out.println("3. Verificar si el usurio puede votar");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

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
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 0);
    }

}
