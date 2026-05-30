/*
Escrever um programa que declare um vetor de 20 inteiros, leia um valor para cada posição.
E no final mostre quantos elementos possuem valor maior, menor e igual ao elemento do vetor que o usuário escolher
*/

package lista8;

import java.util.Scanner;

public class L808 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME UM NUMERO: ");
            vetor[i] = in.nextInt();
        }

        System.out.print("VETOR = { ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" }");
    
        System.out.println("ESCOLHA UMA POSIÇÃO DO VETOR (0 a 19): ");
        int posicao = in.nextInt();
        int numeroEscolhido = vetor[posicao];
        int maiorQueOEscolhido = 0;
        int menorQueOEscolhido = 0;
        int igualAoEscolhido = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (numeroEscolhido > vetor[i]) {
                menorQueOEscolhido++;                
            } else if ( numeroEscolhido < vetor[i]) {
                maiorQueOEscolhido++;
            } else {
                igualAoEscolhido++;
            }
        }

        System.out.println("VALOR ESCOLHIDO = " + vetor[posicao]);
        System.out.println("MAIOR QUE O ESCOLHIDO = " + maiorQueOEscolhido);
        System.out.println("MENOR QUE O ESCOLHIDO = " + menorQueOEscolhido);
        System.out.println("IGUAL AO ESCOLHIDO = " + igualAoEscolhido);

        in.close();
    }
}