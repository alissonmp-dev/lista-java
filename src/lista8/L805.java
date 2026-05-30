/*
Fazer um algoritmo que leia vinte números inteiros armazenando-os em um vetor.
A seguir, troque o conteúdo da primeira posição do vetor com o conteúdo da décima primeira posição, o conteúdo da segunda posição com o da décima segunda, e assim, sucessivamente.
Escreva o vetor após estas modificações.
*/

package lista8;

import java.util.Scanner;

public class L805 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[20];
        int[] vetorAux = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME UM NUMERO: ");
            vetor[i] = in.nextInt();
        }
        
        for (int i = 0; i < vetor.length/2; i++) {
            vetorAux[i] = vetor[i];
            vetor[i] = vetor[i+10];
            vetor[i+10] = vetorAux[i];
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        in.close();
    }    
}