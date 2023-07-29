package com.example;

import java.util.Arrays;

public class App5_Arrays {
    public static void main(String[] args) {
        double vetor [] = {10, 20, 30};
        System.out.println(Arrays.toString(vetor));
        System.out.println(vetor[0]);

        vetor[0] = 1;
        System.out.println(vetor[0]);

        int vetor2 [] = new int [3];
        vetor2[0] = 1;
        vetor2[1] = 2;
        vetor2[2] = 3;
        System.out.println(Arrays.toString(vetor2));

        double matriz[][] = { {1,2,3}, {4,5,6} };
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));

        matriz[0][1] = -2;
        System.out.println(Arrays.toString(matriz[0]));

        matriz[0] = new double[] {7,8,9};
        System.out.println(Arrays.toString(matriz[0])); 

    }
}
