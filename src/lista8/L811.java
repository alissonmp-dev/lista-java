/*
Faça um programa que recebe dois vetores de tamanho que o usuário escolha.
Execute a soma destes, elemento a elemento e coloque em um outro vetor.
*/

package lista8;

import java.util.Scanner;

public class L811 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME O TAMANHO DO VETORES: ");
        int tamanhoVetor = in.nextInt();

        int[] v1 = new int[tamanhoVetor];
        int[] v2 = new int[tamanhoVetor];
        int[] soma = new int[tamanhoVetor];

        System.out.println("VALORES DO V1");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("INFORME UM NUMERO: ");
            v1[i] = in.nextInt();
        }

        System.out.println("VALORES DO V2");
        for (int j = 0; j < tamanhoVetor; j++) {
            System.out.print("INFORME UM NUMERO: ");
            v2[j] = in.nextInt();
        }

        for (int k = 0; k < tamanhoVetor; k++) {
            soma[k] = v1[k] + v2[k];
        }

        for (int l = 0; l < tamanhoVetor; l++) {
            System.out.print(soma[l] + " ");
        }

        in.close();
    }
}