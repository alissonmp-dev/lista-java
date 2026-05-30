/*
Faça um programa que calcule o desvio padrão de um vetor v contendo n = 10 números, onde m é a media do vetor.
loucura isso aqui ta
 */

package lista8C;

import java.util.Scanner;

public class L8C10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int soma = 0;
        double media = 0;
        double calcSomatoria = 0;
        double somatoria = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR DA POSIÇÃO " + i + " NO VETOR: ");
            vetor[i] = in.nextInt();
        }

        System.out.print("VETOR = { ");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println("}");

        for (int i : vetor) {
            soma = soma + i;
        }
        
        media = (double) soma / vetor.length;

        for ( int i : vetor) {
            calcSomatoria = (i - media) * (i - media);
            somatoria = somatoria + calcSomatoria;
        }
        
        double desvioPadrao = Math.sqrt(somatoria / (vetor.length - 1));

        System.out.println("DESVIO PADRAO = " + desvioPadrao);

        in.close();
    }   
}