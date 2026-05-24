/*
Escreva um programa em JAVA para calcular a média de valores PARES e ÍMPARES, que serão digitados pelo usuário.
Ao final o algoritmo deve mostrar estas duas médias.
O algoritmo deve mostrar também o maior número PAR digitado e o menor número ÍMPAR digitado.
Para finalizar o usuário irá digitar um valor negativo.
*/

package lista4;

import java.util.Scanner;

public class L421 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        

        int numero = 1;
        double somaValoresPares = 0;
        int qtdPar = 0;
        double somaValoresImpares = 0;
        int qtdImpar = 0;
        int maiorPar = Integer.MIN_VALUE;
        int menorImpar = Integer.MAX_VALUE;

        while (numero > 0) {
            System.out.println("DIGITE UM NUMERO: ");
            numero = in.nextInt();
            if (numero > 0 && numero % 2 == 0) {
                System.out.println("É PAR");
                somaValoresPares = numero + somaValoresPares;
                qtdPar++;
                if (numero > maiorPar) {
                    maiorPar = numero;
                }
            } else if (numero > 0) {
                System.out.println("É IMPAR");
                somaValoresImpares = numero + somaValoresImpares;
                qtdImpar++;
                if (numero < menorImpar) {
                    menorImpar = numero;
                }
            }
        }

        double mediaPares = somaValoresPares / qtdPar;
        double mediaImpares = somaValoresImpares / qtdImpar;

        System.out.println("QUANTIDADE DE IMPARES = " + qtdImpar);
        System.out.println("QUANTIDADE DE PARES = " + qtdPar);

        System.out.println("MAIOR PAR = " + maiorPar);
        System.out.println("MENOR IMPAR = " + menorImpar);
        System.out.println("MEDIA VALORES PARES: " + mediaPares);
        System.out.println("MEDIA VALORES IMPARES: " + mediaImpares);

        in.close();

    }
}