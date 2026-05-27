/*
Crie 2 vetores de 10 posições cada um (chame de v1[10] e v2[10]). Digite 10 valores
para v1, usando printf e scanf. Agora, use o v2 para armazenar A SOMA de TODOS
os valores de índices anteriores de v1, inclusive o próprio índice. Exemplo:
v2[0] deve armazenar o valor de v1[0];
v2[1] deve armazenar o valor de v1[0] + v1[1];
v2[2] deve armazenar o valor de v1[0] + v1[1] + v1[2];
*/

package lista8;

import java.util.Scanner;

public class L810 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] v1 = new int[10];
        int[] v2 = new int[10];

        for (int i = 0; i < v1.length; i++) {
            System.out.print("INFORME UM NUMERO: ");
            v1[i] = in.nextInt();
        }

        System.out.print("V1 = { ");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.printf(" }%n");

        v2[0] = v1[0];

        for (int i = 1; i < v1.length; i++) {
            v2[i] = (v2[i-1]) + (v1[i]);
        }

        System.out.print("V2 = { ");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.print("}");
        
        in.close();
    }
}