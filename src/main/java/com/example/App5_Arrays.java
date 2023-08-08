package com.example;

import java.util.Arrays;

public class App5_Arrays {
    public static void main(String[] args) {
        // Primeira forma de declarar um vetor.
        double vetor [] = {10, 20, 30};
        System.out.println(Arrays.toString(vetor));
        System.out.println(vetor[0]);

        vetor[0] = 1;
        System.out.println(vetor[0]);

        // Segunda forma de declarar um vetor.
        int vetor2 [] = new int [3];
        vetor2[0] = 1;
        vetor2[1] = 2;
        vetor2[2] = 3;
        System.out.println(Arrays.toString(vetor2));

        // Para declarar uma matriz.
        double matriz[][] = { {1,2,3}, {4,5,6} };
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));

        // Para alterar um valor de uma matriz.
        matriz[0][1] = -2;
        System.out.println(Arrays.toString(matriz[0]));

        // Outra maneira de alterar um valor de uma matriz.
        matriz[0] = new double[] {7,8,9};
        System.out.println(Arrays.toString(matriz[0])); 

    }
}
