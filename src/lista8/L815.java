/*
Leia um vetor de 20 posições e em seguida um valor X qualquer.
Seu programa deverá fazer uma busca do valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado+.
*/

package lista8;

import java.util.Scanner;

public class L815 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("INFORME O VALOR NA POSIÇÃO " + i + " DO VETOR: ");
            vetor[i] = in.nextInt();
        }
        
        System.out.print("VETOR = { ");
        for (int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j] + " ");
        }
        System.out.println("}");

        System.out.print("INFORME UM VALOR QUALQUER: ");
        int valorBuscar = in.nextInt();

        boolean achou = false;
        int posição = 0;

        for (int k = 0; k < vetor.length; k++) {
            if (vetor[k] == valorBuscar) {
                achou = true;
                posição = k;
            }
        }

        if (achou == true) {
            System.out.print("ENCONTRADO NA POSIÇÂO " + posição);
        } else {
            System.out.print(valorBuscar + " NAO FOI ENCONTRADO NO VETOR.");
        }
       
        in.close();
    }
}