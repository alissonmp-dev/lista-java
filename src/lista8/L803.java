/*
Faça um programa onde você declara um vetor de 10 posições que receba respectivamente 10 valores do tipo float (você deverá digitá-los via teclado).
Apresente então, a média desses 10 valores.
*/

package lista8;

import java.util.Scanner;

public class L803 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float soma = 0;

        float[] vetor = new float[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME UM VALOR FLOAT: ");
            vetor[i] = in.nextFloat();
            soma = vetor[i] + soma;
        }

        System.out.print("VETOR = { ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");

        }
        System.out.print("}");
        
        System.out.println("\nMEDIA = " + (soma / 10));

        in.close();
    }
}