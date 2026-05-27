/*
Guarde em um array 10 idades. Exiba quantas pessoas são maior de idade (18 anos) e quantas são menores.
*/

package lista8;

import java.util.Scanner;

public class L812 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("INFORME UMA IDADE: ");
            idades[i] = in.nextInt();
        }

        int maiorDeIdade = 0;
        int menorDeIdade = 0;

        for (int j = 0; j < idades.length; j++) {
            if (idades[j] < 18) {
                menorDeIdade++;
            } else {
                maiorDeIdade++;
            }
        }

        System.out.println("MAIOR DE IDADE: " + maiorDeIdade);
        System.out.println("MENOR DE IDADE: " + menorDeIdade);
        in.close();
    }
}