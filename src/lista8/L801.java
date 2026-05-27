/*
Dada uma seqüência de n números, imprimi-la na ordem inversa à da leitura
*/

package lista8;

import java.util.Scanner;

public class L801 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME O TAMANHO DO VETOR: ");
        int tamanhoVetor = in.nextInt();
     
        int[] sequencia = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("DITITE UM NUMERO: ");
            sequencia[i] = in.nextInt();
        }

        System.out.print("ORDEM INVERSA: ");
        for (int i = tamanhoVetor - 1; i >= 0; i--) {
            System.out.print(sequencia[i] + " ");
        }

        in.close();
    }
}