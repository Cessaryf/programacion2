package com.mycompany.mayorymenor;

import java.util.Scanner;

public class MayorYmenor {

    public static void main(String[] args) {
        int[] numeros = new int[8];
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe 8 numeros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt(); 
        }

        int nmayor = numeros[0];
        int nmenor = numeros[0];

        for (int numero : numeros) {
            if (numero > nmayor) {
                nmayor = numero;
            }
            if (numero < nmenor) {
                nmenor = numero; 
            }
        }

        System.out.println("Numero mayor: " + nmayor);
        System.out.println("Numero menor: " + nmenor);
        
    }
}
