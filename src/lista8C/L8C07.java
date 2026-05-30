/*
Faça um programa que leia um vetor de 15 posições e o compacte, ou seja, elimine as posições com valor zero.
Para isso, todos os elementos a frente do valor zero, devem ser movidos uma posição para trás no vetor.
*/

package lista8C;

import java.util.Scanner;

public class L8C07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[15]; 
        int qtdZeros = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR NA POSIÇÂO " + i + " DO VETOR: ");
            vetor[i] = in.nextInt();
        }
        System.out.println();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 0) {
                qtdZeros++;
                }
        }

        int[] vetorReduzido = new int[vetor.length - qtdZeros];

        int iReduzido = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                vetorReduzido[iReduzido] = vetor[i];
                iReduzido++;
            }
        }

        for (int i = 0; i < vetorReduzido.length; i++) {
            System.out.print(vetorReduzido[i] + " ");
        }

        in.close();
    }   
}