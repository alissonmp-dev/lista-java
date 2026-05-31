/*
Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos juntamente com o maior, o menor e a media dos valores.
*/

package lista11Vetor;

import java.util.Scanner;

public class L1112Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] vetor = new double[5];
        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME A NOTA DO ALUNO " + i + ": ");
            vetor[i] = in.nextDouble();
            if (vetor[i] > maior) {
                maior = vetor[i];
            } 
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            soma = soma + vetor[i];
        }
        
        double media = soma / vetor.length;

        for (double i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("MAIOR VALOR: " + maior);
        System.out.println("MENOR VALOR: " + menor);
        System.out.println("MEDIA = " + media);
        in.close();
    }   
}