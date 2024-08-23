package com.mycompany.exercisesprogram.SegundaSemana.Ejercicios;

public class OperacionesSimples {
    private int num_1;
    private int num_2;

    // Constructor
    public OperacionesSimples(int num_1, int num_2){
        this.num_1 = num_1;
        this.num_2 = num_2;
    }

    // Método que realiza el proceso de SUMA
    public int suma(){
        int suma = num_1 + num_2;
        System.out.println("El resultado es " + suma);
        return suma;
    }

    // Método que realiza el proceso de RESTA
    public int resta(){
        int resta = num_1 - num_2;
        System.out.println("El resultado es " + resta);
        return resta;
    }

    // Método que realiza el proceso de MULTIPLICACIÓN
    public int multiplicar(){
        int multiplicar = num_1 * num_2;
        System.out.println("El resultado es " + multiplicar);
        return multiplicar;
    }

    // Método que realiza el proceso de DIVISIÓN
    public float dividir(){
        float dividir = num_1 / num_2;
        System.out.println("El resultado es " + dividir);
        return dividir;
    }

}
