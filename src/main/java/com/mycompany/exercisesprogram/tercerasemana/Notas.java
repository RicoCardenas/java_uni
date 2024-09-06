package com.mycompany.exercisesprogram.tercerasemana;

public class Notas {
    // Atributos
    private float[] totNotas;
    private int porEncima;
    private int porDebajo;

    // Constructor que recibe un arreglo de notas
    public Notas(float[] totNotas) {
        this.totNotas = totNotas;
    }
    

    public float getCalcPromedio() {
        int promedio = 0;
        // Suma todas las notas
        for (int i = 0; i < totNotas.length; i++) {
            promedio += totNotas[i];
        }
        // Calcula el promedio dividiendo la suma total por la cantidad de notas
        return promedio / totNotas.length;
    }

    public int getPorEncima() {
        for (float nota : totNotas) {
            // Incrementa el contador si la nota es mayor que el promedio
            if (nota > getCalcPromedio()) {
                porEncima++;
            }
        }
        return porEncima;
    }

    public int getPorDebajo() {
        for (float nota : totNotas) {
            // Incrementa el contador si la nota es menor o igual que el promedio
            if (nota <= getCalcPromedio()) {
                porDebajo++;
            }
        }
        return porDebajo;
    }
}
