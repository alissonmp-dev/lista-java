/*
Faça um programa que receba do usuario um vetor com 10 posições.
Em seguida deverá ser impresso o maior e o menor elemento do vetor.
*/

package lista11Vetor;

import java.util.Scanner;

public class L1106Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;

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
            } 
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }
        
        System.out.println("MAIOR VALOR NO VETOR = " + maiorValor);
        System.out.println("MENOR VALOR NO VETOR = " + menorValor);
        in.close();
    }   
}