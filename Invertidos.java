package com.mycompany.invertidos;
import java.util.Scanner;
public class Invertidos {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe 6 nnmeros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt(); 
        }

        int n1 = 0;
        int n2 = numeros.length - 1;

        while (n1 < n2) {
            int temp = numeros[n1];
            numeros[n1] = numeros[n2];
            numeros[n2] = temp;

            n1++;
            n2--;
        }

        System.out.println("Numeros invertidos:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
    }
}

