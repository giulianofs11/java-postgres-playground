package com.example;

import java.util.Arrays;

public class App6_LoopFor {
    public static void main(String[] args) {
        
        // Loop For para um vetor
        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 100 * (i+1);
        }
        System.out.println(Arrays.toString(vetor));
        System.out.println();

        // Loop For para criar ma matriz
        double matriz[][] = new double [2][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * matriz[i].length + j+1;
            }
        }
        
        // Loop For para imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
        // Print sem o ln para imprimir em uma linha!!
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
