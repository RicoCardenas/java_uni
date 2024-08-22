package com.mycompany.exercisesprogram.SegundaSemana.enteros;

import java.util.Scanner;

public class EjecutarEnteros {
    public static void main(String[] args) {

        Enteros obj1 = new Enteros();
        System.out.println("Establece el tamaño de el array");
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt(); 
                
        obj1.establecerEnteros(new int[size]); 
        obj1.calcularTipos();

        System.out.println("El total de numeros positivos es " + obj1.getTot_positivos());
        System.out.println("El total de numeros negativos es " + obj1.getTot_negativos());
        System.out.println("El total de ceros es " + obj1.getTot_ceros());
    }
}
