package lista2;

import java.util.Scanner;

public class L225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String msg;

        /*
        . Faça um programa que leia o valor de um produto X e leia a quantidade de reais de um cofrinho que contenha:
        ♦ N moedas de 1 real;
        ♦ N moedas de 50 centavos;
        ♦ N moedas de 25 centavos;
        ♦ N moedas de 10 centavos;
        ♦ N moedas de 5 centavos;
        O programa deverá verificar se o total de reais que contém no cofrinho é o bastante para a compra o produto X.
         */

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = in.nextDouble();

        System.out.print("Digite a quantidade de moedas de 1 real: ");
        int qtdUmReal = in.nextInt();

        System.out.print("Digite a quantidade de moedas de 50 centavos: ");
        int qtd50Centavos = in.nextInt();
        
        System.out.print("Digite a quantidade de moedas de 25 centavos: ");
        int qtd25Centavos = in.nextInt();

        System.out.print("Digite a quantidade de moedas de 10 centavos: ");
        int qtd10Centavos = in.nextInt();

        System.out.print("Digite a quantidade de moedas de 5 centavos: ");
        int qtd5Centavos = in.nextInt();

        in.close();

        double valorUmReal = qtdUmReal * 1.00; 
        double valor50Centavos = qtd50Centavos * 0.50;
        double valor25Centavos = qtd25Centavos * 0.25;
        double valor10Centavos = qtd10Centavos * 0.10;
        double valor5Centavos = qtd5Centavos * 0.05;

        double valorTotal = valorUmReal + valor50Centavos + valor25Centavos + valor10Centavos + valor5Centavos;

        if (valorTotal >= valorProduto) {
            msg = "É o suficiente.";
        } else {
            msg = "Não é o suficiente.";
        }

        System.out.printf("Valor do produto: R$ %.2f.", valorProduto);
        System.out.printf("%nValor no cofrinho: R$ %.2f.", valorTotal);
        System.out.printf("%n%s", msg);
    }
}