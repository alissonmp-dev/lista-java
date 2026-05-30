/*
Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triângulo de Pascal.
Obs: será necessário criar vetores dinamicamente.
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
...
*/

package lista8C;

import java.util.Scanner;

public class L8C09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME O TAMANHO DO VETOR: ");
        int tamanhoVetor = in.nextInt();

        int[] linhaAnterior = new int[]{1};  // começa com a primeira linha

        for (int i = 0; i < linhaAnterior.length; i++) {
            System.out.print(linhaAnterior[i]);
        }
        System.out.println();

        for (int i = 1; i < tamanhoVetor; i++) {
            int[] linhaAtual = new int[i + 1];  // cada linha tem i+1 elementos
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    linhaAtual[j] = 1;  // bordas sempre 1
                } else {
                    linhaAtual[j] = linhaAnterior[j-1] + linhaAnterior[j];
                }
            }
            
            linhaAnterior = linhaAtual;  // linha atual vira a anterior para a próxima iteração
            
            for (int k = 0; k < linhaAtual.length; k++) {
                System.out.print(linhaAnterior[k] + " ");
            }
            System.out.println();
        }

        in.close();
    }   
}