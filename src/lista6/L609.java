/*
O número 3025 possui a seguinte característica: 30 + 25 = 55 e 55² = 3025. 
Fazer um algoritmo para um programa que pesquise e imprima todos os números de quatro algarismos que apresentam tal característica.
*/

package lista6;

import java.util.Scanner;

public class L609 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1000; i <= 9999; i++) {
            int primeiraMetade = i / 100;
            int segundaMetade = i % 100;

            int soma = primeiraMetade + segundaMetade;
            int potencia = soma * soma;
            if (potencia == i) {
                System.out.println(i);
            }
        }

        in.close();
    }   
}