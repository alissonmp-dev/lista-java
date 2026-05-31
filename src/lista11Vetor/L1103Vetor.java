/*
 Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das componentes deste vetor, armazenando o resultado em outro vetor.
 Os conjuntos tem 10 elementos cada.
 Imprimir todos os conjuntos.
*/

package lista11Vetor;

import java.util.Scanner;

public class L1103Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] vetorElevado = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR DO VETOR NA POSICAO " + i + ": ");
            vetor[i] = in.nextInt();
        }

        for (int i =0; i < vetor.length; i++) {
            vetorElevado[i] = vetor[i] * vetor[i];
        }

        for (int i : vetor) {
            System.out.print(i + " ");
        }

        System.out.println();
        
        for (int i : vetorElevado) {
            System.out.print(i + " ");
        }
        
        in.close();
    }   
}