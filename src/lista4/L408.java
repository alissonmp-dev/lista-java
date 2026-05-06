/*
Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva
um algoritmo que permita a entrada das seguintes informações:
a) o número total de mercadorias no estoque
b) o valor de cada mercadoria.
Ao final imprimir o valor total em estoque e a média dos valores das mercadorias
*/
package lista4;

import java.util.Scanner;

public class L408 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valorTotal = 0;
        int i = 1;

        System.out.print("INFORME A QUANTIDADE DE MERCADORIA: ");
        int quantidade = in.nextInt();

        while (i <= quantidade) {        

        System.out.print("INFORME O VALOR DA MERCADORIA: R$ ");
        double valorMercadoria = in.nextDouble();

        valorTotal = valorMercadoria + valorTotal;
        
        i++;
        }
        
        double media = valorTotal / quantidade;

        System.out.print("QUANTIDADE TOTAL DE MERCADORIA: " + quantidade);
        System.out.printf("%nVALOR TOTAL = %.2f", valorTotal);
        System.out.printf("%nMEDIA = R$ %.2f.", media);

        in.close();
    }
}