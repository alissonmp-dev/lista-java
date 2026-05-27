/*
Leia um vetor de 12 posições e em seguida ler também dois valores X e Y quaisquer correspondentes a duas posições no vetor.
Ao final seu programa deverá escrever a soma dos valores encontrados nas respectivas posições X e Y.
O programa deve continuar rodando e perguntando novas posições até que o usuário digite -1 como posição.
*/

package lista8;

import java.util.Scanner;

public class L813 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[12];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("INFORME O VALOR NA POSIÇÃO " + i + " DO VETOR: ");
            vetor[i] = in.nextInt();
        }

        System.out.print("VETOR = { ");
        for (int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j] + " ");
        }
        System.out.print("}");
        
        int posição = 0;
        int valorX = 0;
        int valorY = 0;

        while (posição != -1) {
            System.out.println();
            System.out.println("X + Y = ");
            System.out.print("INFORME O VALOR DA POSIÇÂO DE X: ");
            valorX = in.nextInt();
            if (valorX == -1) {
                posição = valorX;
                break;
            }
            System.out.print("INFORME O VALOR DA POSIÇÂO DE Y: ");
            valorY = in.nextInt();
            if (valorY == -1) {
                posição = valorY;
                break;
            }
            System.out.print("X + Y = " + vetor[valorX] + " + " + vetor[valorY] + " = " + (vetor[valorX] + vetor[valorY]));
        }
        
        in.close();
    }
}