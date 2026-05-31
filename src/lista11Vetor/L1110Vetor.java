/*
Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule e imprima a media geral. 
*/

package lista11Vetor;

import java.util.Scanner;

public class L1110Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[15];
        int somaNotas = 0;

        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME A NOTA DO ALUNO " + i + ": ");
            vetor[i] = in.nextInt();
            somaNotas = somaNotas + vetor[i];
        }
        

        double mediaNotas = (double) somaNotas / vetor.length;

        System.out.println("MEDIA DOS ALUNOS: " + mediaNotas);
        in.close();
    }   
}