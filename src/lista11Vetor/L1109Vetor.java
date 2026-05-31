/*
Crie um programa que le 6 valores inteiros pares e, em seguida, mostre na tela os valores lidos na ordem inversa.
*/

package lista11Vetor;

import java.util.Scanner;

public class L1109Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[6];
        int valor = 0;

        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME O VALOR DO VETOR NA POSICAO " + i + ": ");
            valor = in.nextInt();
            if ( valor % 2 == 0) {
                vetor[i] = valor;
            } else {
                System.out.println("NAO É PAR");
                i--;
            }
        }
        

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[vetor.length - 1 - i] + " ");
        }
        System.out.println();
        
        in.close();
    }   
}