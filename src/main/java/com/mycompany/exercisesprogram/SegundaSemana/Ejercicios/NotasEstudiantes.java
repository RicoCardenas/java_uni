package com.mycompany.exercisesprogram.SegundaSemana.Ejercicios;

public class NotasEstudiantes {
    
    // Arreglo de notas
    private float[] notas = new float[15];

    // Constructor
    public NotasEstudiantes(){
    }

    // Agregar una nota en la posición index
    public void agregarNota(int index, float nota){
        if (index >= 0 && index < notas.length){
            notas[index] = nota;
        }
    }

    // Obtener el tamaño del arreglo de notas
    public int getTamanoNotas(){
        return notas.length;
    }
    
    // Encontrar la mayor y menor nota
    public void encontrarNotas(){

        float mayorNota = notas[0];
        float menorNota = notas[0];
        int posicionMenorNota = 0;

        // Encontrar la mayor y menor nota, y la posición de la menor nota
        for(int i = 0; i < notas.length; i++){
            if (notas[i] > mayorNota) {
                mayorNota = notas[i];
            }
            if (notas[i]< menorNota) {
                menorNota = notas[i];
                posicionMenorNota = i + 1; // +1 para convertir de índice a posición humana
            }
        }

        System.out.println("La mayor nota es: " + mayorNota);
        System.out.println("La menor nota es: " + menorNota + " y se encuentra en la posicion: " + posicionMenorNota);
    }

    // Calcular el total de las notas        
    public void calcularTotal(){
        float total = 0;
            for(int i = 0; i < notas.length; i++){
                total += notas[i];
            }
            System.out.println("El promedio total de las notas es: " + total / notas.length);
    }
    
    // Contar cuántos alumnos tienen una nota superior a 3
    public void calcularPorcentajes(){
        int count = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 3) {
            count++;
            }
        }
        // Calcular el porcentaje de alumnos que pasaron el parcial con nota superior a 3
        float porcentaje = ((float) count / notas.length) * 100;

        System.out.println("El porcentaje de alumnos que pasaron el parcial con nota superior a 3 es: " + porcentaje + "%");
    }        
}   

    
