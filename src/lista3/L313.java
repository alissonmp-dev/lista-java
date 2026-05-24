/*
. Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e
o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço
unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
que:
- Se quantidade <= 5 o desconto será de 2%
- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
- Se quantidade > 10 o desconto será de 5
 */
package lista3;

import java.util.Scanner;

public class L313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe a descrição do produto: ");
        String nomeProduto = in.nextLine();

        System.out.print("Informe a quantididade adquirida: ");
        double qtdProduto = in.nextDouble();

        System.out.printf("Informe o preço unitario da(o) %s: ", nomeProduto);
        double precoUnitarioProduto = in.nextDouble();

        double totalSemDesconto = qtdProduto * precoUnitarioProduto;
        double desconto;

        if (qtdProduto <= 5) {
            desconto = 0.02;
        } else if ( qtdProduto > 10) {
            desconto = 0.05;
        } else {
            desconto = 0.03;
        }

        double valorDesconto = totalSemDesconto * desconto;
        double totalComDesconto = totalSemDesconto - valorDesconto;

        System.out.printf("TOTAL SEM DESCONTO = R$ %.2f.", totalSemDesconto);
        System.out.printf("%nDESCONTO = R$ %.2f.", valorDesconto);
        System.out.printf("%nTOTAL COM DESCONTO: R$ %.2f.", totalComDesconto);

        in.close();
    }
}