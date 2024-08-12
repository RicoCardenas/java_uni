/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercisesprogram;

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

        // Crea una instancia de la clase Register y llama a su método register
        Register ejercicio2 = new Register();
        ejercicio2.register();

        // Crea una instancia de la clase Numbers y llama a su método numbers
        Numbers ejercicio1 = new Numbers();
        ejercicio1.numbers();
    }
}
