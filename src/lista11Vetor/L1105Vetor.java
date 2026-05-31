/*
Leia um vetor de 10 posições.
Contar e escrever quantos valores pares ele possui.
*/

package lista11Vetor;

import java.util.Scanner;

public class L1105Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR DO VETOR NA POSICAO " + i + ": ");
            vetor[i] = in.nextInt();
        }

        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();

        int qtdPares = 0;

        for (int i : vetor) {
            if (i % 2 == 0) {
                qtdPares++;
            }
        }
        
        System.out.println("QUANTIDADE DE PARES NO VETOR: " + qtdPares);
        in.close();
    }   
}