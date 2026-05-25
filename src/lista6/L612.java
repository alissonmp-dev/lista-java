/*
Um número perfeito é aquele cuja soma de seus divisores é igual ao próprio número.
Por exemplo, o número 6 que possui como divisores 1, 2, 3, e como 1+2+3=6.
6 é um número perfeito.
Desenvolva um programa que calcule os números perfeitos no intervalo de 0 a 1000.
*/

package lista6;

import java.util.Scanner;

public class L612 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i <= 1000; i++) {
            int soma = 0;
            
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    soma = soma + j;
                }
            }
            if (soma == i) {
                System.out.println(i);
            }
        }

        System.out.println();
        in.close();
    }   
}