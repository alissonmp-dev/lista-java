/*
Tentando descobrir se um dado era viciado, um dono de cassino honesto (ha! ha!
ha! ha!) o lançou n vezes.
Dados os n resultados dos lançamentos, determinar o
número de ocorrências de cada face.
*/

package lista8;

import java.util.Scanner;

public class L802 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valorDado = 0;
        int qtdLado1 = 0;
        int qtdLado2 = 0;
        int qtdLado3 = 0;
        int qtdLado4 = 0;
        int qtdLado5 = 0;
        int qtdLado6 = 0;

        System.out.print("INFORME O NUMERO DE LANÇAMENTOS DO DADO: ");
        int lançamentosDado = in.nextInt();
        
        for (int i = 0; i < lançamentosDado; i++) {

            System.out.print("INFORME O VALOR DO DADO: ");
            valorDado = in.nextInt();
            
            if (valorDado > 0 && valorDado <= 6) {
            
                if (valorDado == 1) {
                    qtdLado1++;
                } else if (valorDado == 2) {
                    qtdLado2++;
                } else if (valorDado == 3) {
                    qtdLado3++;
                } else if (valorDado == 4) {
                    qtdLado4++;
                } else if (valorDado == 5) {
                    qtdLado5++;
                } else if (valorDado == 6) {
                    qtdLado6++;
                }
            } else {
                System.out.println("VALOR INVALIDO");
            }
        }
    
        System.out.printf("\nFACE 1 apareceu %d vezes.", qtdLado1);
        System.out.printf("\nFACE 2 apareceu %d vezes.", qtdLado2);
        System.out.printf("\nFACE 3 apareceu %d vezes.", qtdLado3);
        System.out.printf("\nFACE 4 apareceu %d vezes.", qtdLado4);
        System.out.printf("\nFACE 5 apareceu %d vezes.", qtdLado5);
        System.out.printf("\nFACE 6 apareceu %d vezes.", qtdLado6);

        in.close();
    }
}