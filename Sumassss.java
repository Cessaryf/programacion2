package com.mycompany.sumassss;

import java.util.Scanner;

public class Sumassss {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("escribe 5 numeros");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt(); 
        }
        int total = 0;

        for (int numero : numeros) {
            total += numero; 
        }

        System.out.println("suma total: " + total);
        
    }
}

