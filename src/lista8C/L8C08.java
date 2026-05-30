/*
Faça um programa que leia dois vetores de 10 elementos.
Crie um vetor que seja a intersecção entre os 2 vetores anteriores, ou seja, que contêm apenas os números que estão em ambos os vetores.
Não deve conter números repetidos e considere a entrada de ambos os vetores ordenada.
*/

package lista8C;

import java.util.Scanner;

public class L8C08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor1 = new int[]{1,2,3,4,5};
        int[] vetor2 = new int[]{2,4,2,6,7};
        int qtdSemelhantes = 0;
        
        /*
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("INFORME O VALOR NA POSIÇÂO " + i + " DO VETOR: ");
            vetor[i] = in.nextInt();
        }
        System.out.println();
        */

        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length;j++){
                if (vetor1[i] == vetor2[j]) {
                    qtdSemelhantes++;
                }
            }
        }

        int[] vetorSemelhante = new int[qtdSemelhantes];
        int iSemelhantes = 0;
        boolean jaExiste = false;

        for (int i = 0; i < vetor2.length; i++) {
            for (int j = 0; j < vetor1.length; j++) {
                if (vetor1[j] == vetor2[i]) {
                    jaExiste = false;
                    for (int k = 0; k < iSemelhantes; k++) {
                        if (vetorSemelhante[k] == vetor2[i]) {
                            jaExiste = true;
                            break;
                        }
                    }
                    if (!jaExiste) {
                        vetorSemelhante[iSemelhantes] = vetor2[i];
                        iSemelhantes++;
                    }
                }
            }
        }

        for (int i = 0; i < iSemelhantes; i++) {
            System.out.print(vetorSemelhante[i] + " ");
        }

        in.close();
    }   
}