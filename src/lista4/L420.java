/*
Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele tamanho com asteriscos.
Seu programa deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.
*/

package lista4;

import java.util.Scanner;

public class L420 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME O TAMANHO DO LADO DE UM QUADRRADO: ");
        int ladoQuadrado = in.nextInt();

        for (int i = 0; i < ladoQuadrado; i++) {
            for (int j = 0; j < ladoQuadrado; j++) {
                System.out.print("*");
            }
            System.out.println();    
        }
        
        in.close();
    }
}