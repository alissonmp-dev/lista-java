/*
HARD
Faça um programa que mostre os n termos da Série a seguir:
S = 1/1! + 2/3! + 3/5! + 4/7! + 5/9! + ... + n/m!.
Imprima no final a soma da série. 
O fatorial é calculado da seguinte maneira:
5! = 5 * 4 * 3 * 2 * 1
9! = 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
*/

package lista4;

import java.util.Scanner;

public class L430 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double somaFatorial = 0;
        int numerador = 1;
        int denominador = 1;

        System.out.print("DIGITE O VALOR DE N: ");
        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int fatorial = 1;
            for (int j = 1; j <= denominador; j++) {
                fatorial = fatorial * j;
            }
            double resultado =  (double) numerador / fatorial;

            System.out.println(resultado);
            somaFatorial = somaFatorial + resultado;
            numerador++;
            denominador += 2;
        }

        System.out.println(somaFatorial);

        in.close();
    }
}