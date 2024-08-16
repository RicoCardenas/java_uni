package com.mycompany.exercisesprogram.PrimeraSemana;

import java.util.Scanner;

public class TablasMultiplicar {
        
        public void tablas(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Que numero quieres multiplicar?");
            float numero = sc.nextFloat();

            System.out.println("Cuantas veces quieres multiplicar el numero?");
            int veces = sc.nextInt();

            for (int i = 1; i <= veces; i++){
                System.out.println(numero + " x " + i + " = " + numero * i);
            }

        }
}
