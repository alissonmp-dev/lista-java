/*
Ler um vetor de 10 elementos inteiros e positivos.
Criar um segundo vetor da seguinte forma:
os elementos de índice par receberão os respectivos elementos divididos por 2;
os elementos de índice ímpar receberão os respectivos elementos multiplicados por 3.
Imprima os dois vetores.
*/

package lista8C;

import java.util.Scanner;

public class L8C02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] vetorModificado = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR DO VETOR NA POSIÇÂO " + i + ": ");
            vetor[i] = in.nextInt(); 
        }
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            if(i % 2 == 0) {
                vetorModificado[i] = vetor[i] / 2;
            } else {
                vetorModificado[i] = vetor[i] * 3;
            }
            System.out.print(vetorModificado[i] + " ");
        }
        
        in.close();
    }   
}