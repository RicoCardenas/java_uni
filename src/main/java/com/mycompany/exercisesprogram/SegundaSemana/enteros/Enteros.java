package com.mycompany.exercisesprogram.SegundaSemana.enteros;

import java.util.Scanner;

public class Enteros {
    private int tot_positivos;
    private int tot_negativos;
    private int tot_ceros;
    private int[] numeros;

    Scanner sc = new Scanner(System.in);

    public Enteros(){
        this.tot_positivos = 0;
        this.tot_positivos = 0;
        this.tot_ceros = 0;
    }

    public void establecerEnteros(int[] numeros){
        this.numeros = numeros;
    }

    public void calcularTipos(){
        
        int i;

        for(i = 0; i < numeros.length; i++){}
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
        
        for(i = 0; i < numeros.length; i++){
            if (numeros[i] > 0) {
                tot_positivos++;
            } else if (numeros[i] < 0) {
                tot_negativos++;
            } else {
                tot_ceros++;
            }
        }
    }

    public int getTot_positivos() {
        return tot_positivos;
    }

    public int getTot_negativos() {
        return tot_negativos;
    }

    public int getTot_ceros() {
        return tot_ceros;
    }

}
