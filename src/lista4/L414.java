/*
Ler 10 valores e escrever quantos desses valores lidos estão compreendidos entre o
intervalo de 1 até 10. Mostre a multiplicação entre valores digitados no intervalo de 0
e 10, e a soma dos valores fora deste intervalo.
*/
package lista4;

import java.util.Scanner;

public class L414 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 0;
        int valoresDentro = 0;
        int valoresFora = 0;
        int multiplicacaoDentro = 1;
        int somaFora = 0;

        while (i < 10) {
            System.out.print("DIGITE UM VALOR: ");
            int valor = in.nextInt();

            if (valor >= 1 && valor <= 10) {
                valoresDentro = valoresDentro +1;
                multiplicacaoDentro = multiplicacaoDentro * valor;
            } else {
                valoresFora = valoresFora + 1;
                somaFora = somaFora + valor;
            }
            i++;
        }

        System.out.println("VALORES DENTRO: " + valoresDentro);
        System.out.println("MULTIPLICAÇÂO = " + multiplicacaoDentro);
        System.out.println("VALORES FORA: " + valoresFora);
        System.out.println("SOMA FORA = " + somaFora);

        in.close();
    }
}