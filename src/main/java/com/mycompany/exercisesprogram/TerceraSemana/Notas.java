package com.mycompany.exercisesprogram.TerceraSemana;

public class Notas {
    private float[] totNotas;
    private int porEncima;
    private int porDebajo;

    public Notas(float[] totNotas) {
        this.totNotas = totNotas;
    }
    
    public float getCalcPromedio(){
        int promedio = 0;
        for (int i = 0; i < totNotas.length; i++) {
            promedio += totNotas[i];
        }
        return promedio / totNotas.length;
    }

    public int getPorEncima() {
        for (float nota : totNotas) {
            if (nota > getCalcPromedio()){
                porEncima++;
            }
        }
        return porEncima;
    }

    public int getPorDebajo() {
        for (float nota : totNotas) {
            if(nota <=  getCalcPromedio()){
                porDebajo++;
            }
        }
        return porDebajo;
    }
}
