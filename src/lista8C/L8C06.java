/*
Utilizando vetores, crie um programa que organize uma quantidade qualquer de números inteiros fornecidos pelo usuário da seguinte forma:
primeiro os números pares em ordem crescente e depois os números ímpares em ordem decrescente.
*/

package lista8C;

import java.util.Scanner;

public class L8C06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[]{1,3,5,7,8,9,102,5,6,59,593};
        
        /*
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR NA POSIÇÂO " + i + " DO VETOR: ");
            vetor[i] = in.nextInt();
        }
        System.out.println();
        
        */

        System.out.print("\nVetor = { ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("}");

        int tamanhoVetorPar = 0;
        int tamanhoVetorImpar = 0;

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] % 2 == 0) {
                tamanhoVetorPar++;
            } else {
                tamanhoVetorImpar++;
            }            
        }
        
        int[] vetorPar = new int[tamanhoVetorPar];
        int[] vetorImpar = new int[tamanhoVetorImpar];

        int iPar = 0;
        int iImpar = 0;

        for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] % 2 == 0) {
                    vetorPar[iPar] = vetor[i];
                    iPar++;
                } else {
                    vetorImpar[iImpar] = vetor[i];
                    iImpar++;
                }
            }

        System.out.print("\nVETOR PAR = { ");
        for (int i = 0; i < vetorPar.length; i++) {
            System.out.print(vetorPar[i] + " ");
        }
        System.out.print("}");

        System.out.print("\nVETOR IMPAR = { ");
        for (int j = 0; j < vetorImpar.length; j++) {
            System.out.print(vetorImpar[j] + " ");
        }
        System.out.println("}");

        for (int i = 0; i < vetorPar.length - 1; i++) {
            for (int j = 0; j < vetorPar.length - 1 - i; j++){
                if (vetorPar[j] > vetorPar[j + 1]) {
                    int temp = vetorPar[j];
                    vetorPar[j] = vetorPar[j + 1];
                    vetorPar[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < vetorImpar.length - 1; i++) {
            for (int j = 0; j < vetorImpar.length - 1 - i; j ++){
                if (vetorImpar[j] < vetorImpar[j+1]) {
                    int temp = vetorImpar[j];
                    vetorImpar[j] = vetorImpar[j + 1];
                    vetorImpar[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < vetorPar.length; i++) {
            System.out.print(vetorPar[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < vetorImpar.length; i++) {
            System.out.print(vetorImpar[i] + " ");
        }

        int[] resultado = new int[vetor.length];

        for (int i = 0; i < vetorPar.length; i++) {
            resultado[i] = vetorPar[i];
        }

        for (int i = 0; i < vetorImpar.length; i++ ) {
            resultado[i + vetorPar.length] = vetorImpar[i];
        }

        System.out.println();

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }

        in.close();
    }   
}