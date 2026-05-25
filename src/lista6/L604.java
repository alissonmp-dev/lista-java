/*
Escrever um algoritmo que calcule os sucessivos valores de E usando a série abaixo e considerando que ovalor de n deve ser fornecido pelo usuário.
E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/n!
*/

package lista6;

import java.util.Scanner;

public class L604 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int somaFatorial = 1;
        double fatorial = 0;
        double soma = 1;
        double numerador = 1;

        System.out.print("INFORME O VALOR DE N: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            somaFatorial = i * somaFatorial;
            fatorial = numerador / somaFatorial;
            System.out.printf("1 / %d = %f.%n", somaFatorial, fatorial);
            soma = fatorial + soma;
        }

        System.out.println("SOMA = " + soma);

        in.close();
    }   
}