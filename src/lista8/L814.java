/*
Crie um vetor com 10 números e, dentro de um laço de repetição permita que o usuário escolha duas posições e troque o valor destas posições.
A cada troca o programa deve mostrar o vetor em questão.

*/

package lista8;

import java.util.Scanner;

public class L814 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];

        int encerrar = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("INFORME O VALOR NA POSIÇÃO " + i + " DO VETOR: ");
            vetor[i] = in.nextInt();
        }

        while (encerrar != -1) {
            
            System.out.print("VETOR = { ");
            for (int j = 0; j < vetor.length; j++) {
                System.out.print(vetor[j] + " ");
            }
            System.out.println("}");
            
            System.out.print("ESCOLHA UMA POSIÇÂO DE 0 À 9: ");
            int posiçãoX = in.nextInt();

            if (posiçãoX == -1) {
                encerrar = posiçãoX;
                break;
            }

            System.out.print("ESCOLHA OUTRA POSIÇÂO DE 0 À 9: ");
            int posiçãoY = in.nextInt();

            if (posiçãoY == -1) {
                encerrar = posiçãoX;
                break;
            }

            int auxiliar = vetor[posiçãoX];
            vetor[posiçãoX] = vetor[posiçãoY];
            vetor[posiçãoY] = auxiliar;
        }
                
        in.close();
    }
}