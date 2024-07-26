package com.mycompany.pares;
import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        Scanner teclado = new Scanner(System.in);
                System.out.println("vas a ingresar 10 numeros");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt(); 
        }

        int npares = 0;
        int nimpares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                npares++;
            } else {
                nimpares++;
            }
        }

        System.out.println("numeros pares: " + npares);
        System.out.println("numeros impares: " + nimpares);
        
        teclado.close();
    }
}