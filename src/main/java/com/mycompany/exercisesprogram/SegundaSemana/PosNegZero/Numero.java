package com.mycompany.exercisesprogram.SegundaSemana.PosNegZero;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pos = 0;
        System.out.println("Ingrese un numero: ");
        float number = sc.nextFloat();
        if (number > 0){
            Positivos num_pos = new Positivos();
            num_pos.positivos();
        }

    }
}
