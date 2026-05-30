/*
Ler um vetor de 10 elementos.
Crie um segundo vetor, com todos os elementos na ordem inversa
Imprima os dois vetores no final.
*/

package lista8C;

import java.util.Scanner;

public class L8C01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] vetorInverso = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR DO VETOR NA POSIÇÂO " + i + ": ");
            vetor[i] = in.nextInt(); 
        }
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            vetorInverso[i] = vetor[vetor.length - 1 - i];
            System.out.print(vetorInverso[i] + " ");
        }

        in.close();
    }   
}