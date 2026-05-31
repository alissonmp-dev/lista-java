/*
Faça um programa que possua um vetor denominado A que armazene 6 numeros inteiros.
O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variavel inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

package lista11Vetor;

import java.util.Scanner;

public class L1101Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetorA = new int[]{1,0,5,-2,-5,7};

        System.out.print("a) ");
        for (int i : vetorA) {
            System.out.print(i + " ");
        }
        System.out.println();

        int soma = vetorA[0] + vetorA[1] + vetorA[5];       
        System.out.println("b) " + soma);

        vetorA[4] = 100;
        System.out.print("c) ");
        for (int i : vetorA) {
            System.out.print(i + " ");
        }
    
        System.out.println("d) ");
        for (int i : vetorA) {
            System.out.println(i);
        }

        in.close();
    }   
}