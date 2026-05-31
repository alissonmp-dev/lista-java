/*
Fazer um programa para ler 5 valores e, em seguida, mostrar a posição onde se encontram o maior e o menor valor.
*/

package lista11Vetor;

import java.util.Scanner;

public class L1113Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int posiçãoMenor = 0;
        int posiçãoMaior = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME A NOTA DO ALUNO " + i + ": ");
            vetor[i] = in.nextInt();
            if (vetor[i] > maior) {
                maior = vetor[i];
                posiçãoMaior = i;
            } 
            if (vetor[i] < menor) {
                menor = vetor[i];
                posiçãoMenor = i;
            }
        }
        

        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("MAIOR VALOR: " + maior);
        System.out.println("POSIÇÂO MAIOR: " + posiçãoMaior);
        System.out.println("MENOR VALOR: " + menor);
        System.out.println("POSIÇÂO MENOR: " + posiçãoMenor);
        in.close();
    }   
}