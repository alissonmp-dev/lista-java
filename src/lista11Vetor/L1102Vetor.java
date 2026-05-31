/*
Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
*/

package lista11Vetor;

import java.util.Scanner;

public class L1102Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[6];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR DO VETOR NA POSICAO " + i + ": ");
            vetor[i] = in.nextInt();
        }

        for (int i : vetor) {
            System.out.print(i + " ");
        }
        
        in.close();
    }   
}