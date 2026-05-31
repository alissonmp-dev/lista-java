/*
Crie um programa que preencha um vetor com 10 numeros reais, calcule e mostre a quantidade de numeros negativos e a soma dos números positivos desse vetor. 
*/

package lista11Vetor;

import java.util.Scanner;

public class L1111Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] vetor = new double[10];
        double somaPositivos = 0;
        int qtdNegativos = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME A NOTA DO ALUNO " + i + ": ");
            vetor[i] = in.nextDouble();
            if (vetor[i] >= 0) {
                somaPositivos = somaPositivos + vetor[i];
            } else {
                qtdNegativos++;
            }
        }
        
        System.out.println("SOMA DOS POSITIVOS: " + somaPositivos);
        System.out.println("QUANTIDADE DE NEGATIVOS: " + qtdNegativos);
        in.close();
    }   
}