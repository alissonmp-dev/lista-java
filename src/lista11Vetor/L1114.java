/*
Crie um programa que leia um vetor de 10 posições e verifique se existem valores iguais e os escreva na tela.
*/

package lista11Vetor;

import java.util.Random;
import java.util.Scanner;

public class L1114 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        Random random = new Random();

        /*
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR DA POSICAO " + i + ": ");
            vetor[i] = in.nextInt();
        }
        */

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(5); 
        }

        for (int i : vetor) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[i] == vetor[i - 1]) {
                    System.out.print(vetor[i] + " ");
                    break;
                }
            }
        }

        in.close();
    }
}