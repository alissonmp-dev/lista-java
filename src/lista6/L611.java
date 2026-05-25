/*
Faça um programa que leia dois números inteiros positivos: lin e col. 
Desenhe um retângulo usando o valor de lin e col.
Exemplo: lin=5 e col =10
 ----------
|          |
|          |
|          |
|          |
|          |
 ----------
*/

package lista6;

import java.util.Scanner;

public class L611 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME O VALOR DE LINHA: ");
        int linha = in.nextInt();

        System.out.print("INFORME O VALOR DE COLUNA: ");
        int coluna = in.nextInt();

        System.out.print(" ");
        for (int i = 0; i < linha; i++) {
            System.out.print("-");
        }

        System.out.println("");

        for (int j = 0; j < coluna; j++) {
            System.out.print("|");
            for (int l = 0; l < linha; l++) {
            System.out.print(" ");
        }
        System.out.println("|");
        }

        System.out.print(" ");
        for (int k = 0; k < linha; k++) {
            System.out.print("-");
        }

        in.close();
    }   
}