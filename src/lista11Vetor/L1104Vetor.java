/*
Faça um programa que leia um vetor de 8 posições e, em seguida, leia também dois valores X e Y quaisquer correspondentes a duas posições no vetor.
Ao final seu programa devera escrever a soma dos valores encontrados nas respectivas posições X e Y.
*/

package lista11Vetor;

import java.util.Scanner;

public class L1104Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR DO VETOR NA POSICAO " + i + ": ");
            vetor[i] = in.nextInt();
        }

        for (int i : vetor) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("INFORME A POSIÇÂO X: ");
        int posiçãoX = in.nextInt();

        System.out.print("INFORME A POSIÇÂO Y: ");
        int posiçãoY = in.nextInt();

        int soma = vetor[posiçãoX] + vetor[posiçãoY];

        System.out.println("SOMA  = " + soma);
        
        in.close();
    }   
}