/*
Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. 
Imprima o vetor, o maior elemento e a posição que ele se encontra.
*/

package lista11Vetor;

import java.util.Scanner;

public class L1107Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int maiorValor = Integer.MIN_VALUE;
        int posição = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR DO VETOR NA POSICAO " + i + ": ");
            vetor[i] = in.nextInt();
        }

        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posição = i;
            } 
        }
        
        System.out.println("MAIOR VALOR DO VETOR = " + maiorValor);
        System.out.println("POSIÇÂO DO MAIOR VALOR NO VETOR = " + posição);
        in.close();
    }   
}