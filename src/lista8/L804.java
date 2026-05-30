/*
Faça um programa que leia 10 valores do teclado, e que imprima esses valores divididos em 2 etapas: 
primeiro, somente os valores pares, e depois, somente os valores ímpares. 
Identifique cada valor escrevendo ao lado do valor se ele é par ou ímpar.
*/

package lista8;

import java.util.Scanner;

public class L804 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME UM NUMERO: ");
            vetor[i] = in.nextInt();
        }

        System.out.println("VALORES PARES: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i] + " É PAR");
            }
        }

        System.out.println("VALORES IMPARES: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println(vetor[i] + " É IMPAR");
            }
        }

        in.close();
    }    
}