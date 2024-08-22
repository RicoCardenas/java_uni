package com.mycompany.exercisesprogram.SegundaSemana.Ejercicios;

public class EstaturasEstudiantes {

    //Arreglo de estaturas
    private double[] estaturas = new double[25];

    //Constructor
    public EstaturasEstudiantes() {
    }
    
    //Agrega una estatura en la posición index
    public void agregarEstatura(int index, double estatura){
        if (index >= 0 && index < estaturas.length){
            estaturas[index] = estatura;
        }
    }

    //Obtiene el tamaño del arreglo de estaturas
    public int getTamanoEstaturas(){
        return estaturas.length;
    }

    //Encuentra la altura mas alta
    public void estaturaMasAlta(){

        double mayorEstatura = estaturas[0];
        
        for (int i = 0; i < estaturas.length; i++) {
            if (estaturas[i] > mayorEstatura) {
                mayorEstatura = estaturas[i];
            }
        }
        System.out.println("La estatura mas alta es: " + mayorEstatura);
    }

    //Encuentra la altura mas baja
    public void estaturaMasBaja() {
        double menorEstatura = estaturas[0];

        for (int i = 0; i < estaturas.length; i++) {
            if (estaturas[i] < menorEstatura) {
                menorEstatura = estaturas[i];
            }
        }
        System.out.println("La estatura mas baja es: " + menorEstatura);
    }
}
