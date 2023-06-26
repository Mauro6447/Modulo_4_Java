package com.individual24;
import java.lang.Math;

/*
 * Gabriela Moya
 * Profe en mi sinceridad, no entendi el ejercicio, pero use chat gpt me dio ayuda.
 * asi que parto con la explicacion.
 * n es el numero entero de entrada para iterar n veces
 * luego la suma se multiplica por 4 para tener la estimacion de pi
 * con el metodo math.abs() calculo la diferencia de estimacion de la libreria :)
 */

public class Individual24 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[9]); // Número de términos de la suma

        double suma = 0.0;
        for (int k = 0; k < n; k++) {
            double termino = 1.0 / (2 * k + 1);
            if (k % 2 == 0) {
                suma += termino;
            } else {
                suma -= termino;
            }
        }

        double estimacionPi = 4 * suma;
        double diferencia = Math.abs(estimacionPi - Math.PI);

        System.out.println("Estimación de pi: " + estimacionPi);
        System.out.println("Diferencia con Math.PI: " + diferencia);
    }
    }
