/*
HARD
Escreva um programa que conte de 100 a 999 (inclusive) e exiba, um por linha, o produto dos três dıgitos dos números.
a. Desafio 1 - Faça seu programa dar uma pausa a cada 20 linhas para que seja possível ver todos os números pouco a pouco.
Solicite que seja pressionada alguma tecla para ver a próxima sequência de números. 
Por exemplo, inicialmente o programa irá exibir:
100 (1*0*0)
101 (1*0*1)
102 (1*0*2)
(...)
110 (1*1*0)
111 (1*1*1)
112 (1*1*2)
999 (9*9*9) = 729
*/

package lista4;

import java.util.Scanner;

public class L429 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int linhas = 0;

        for (int i = 100; i <= 999; i++) {
            int centena = i / 100;
            int dezena = i / 10 % 10;
            int unidade = i % 10;

            int produto = centena * dezena * unidade;

            System.out.println(+ i + " " + centena + "*" + dezena + "*" + unidade + " = " + produto);
            linhas++;
            if (linhas % 20 == 0) {
            System.out.println("Pressione Enter para continuar...");
            in.nextLine();
            }
        }
        in.close();
    }
}