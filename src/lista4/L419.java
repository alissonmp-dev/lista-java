/*
Faça um programa que mostre n primeiros valores da sequência de Fibonacci, a
sequência é feita da seguinte maneira: 1 1 2 3 5 8 13 21 34 55 …
*/

package lista4;

import java.util.Scanner;

public class L419 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int antecessor = 0;
        int sucessor = 1;
        int auxiliar;

        System.out.println("INFORME N VALORES DE FIBONACCI: ");
        int sequencia = in.nextInt();

        int i = 0;

        while (i < sequencia) {
            System.out.print(antecessor + " ");

            auxiliar = antecessor + sucessor;
            antecessor = sucessor;
            sucessor = auxiliar;

            i++;
        }

        in.close();
    }
}