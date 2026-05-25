/*
Escreva um programa que leia um valor inteiro n > 0 e desenhe na tela um triângulo com asteriscos (*) que possua a quantidade de linhas n.
Exemplo: n=3
*****
***
*
*/

package lista6;

import java.util.Scanner;

public class L610 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME UM VALOR INTEIRO POSITIVO: ");
        int valor = in.nextInt();

        for (int i = 0; i < valor; i++) {
            for (int j = i; j < valor; j++)  {
                System.out.print("*");
            }
            System.out.println("");
        }

        in.close();
    }   
}