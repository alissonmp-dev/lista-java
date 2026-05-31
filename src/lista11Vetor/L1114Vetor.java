/*
Crie um programa que leia um vetor de 10 posições e verifique se existem valores iguais e os escreva na tela.
*/

package lista11Vetor;

import java.util.Scanner;

public class L1114Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[]{1,1,2,3,4,5,5,6,7,8};
        int[] vetorAux = new int[vetor.length];

        /*
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME A NOTA DO ALUNO " + i + ": ");
            vetor[i] = in.nextInt();
        }
        */

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] == vetor[i]) {
                    vetorAux[j] = vetor[j];
                }
            }    
        }

        for (int i : vetorAux) {
            System.out.print(i + " ");
        }
        in.close();
    }   
}