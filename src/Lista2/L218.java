package lista2;

import java.util.Scanner;

public class L218 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int qtdCarrosVendidos;
        double valorTotalVendas;
        final double salarioFixo;
        double valorPorCarroVendido;
            
        System.out.print("Digite o numero de carros vendidos: ");
        qtdCarrosVendidos = in.nextInt();

        System.out.print("Digite o valor total de vendas: R$ ");
        valorTotalVendas = in.nextDouble();

        System.out.print("Digite o salario fixo: R$ ");
        salarioFixo = in.nextDouble();

        System.out.print("Informe o valor recebido por carro vendido: R$ ");
        valorPorCarroVendido = in.nextDouble();

        in.close();

        if (salarioFixo <= 0 || valorPorCarroVendido <= 0 || qtdCarrosVendidos < 0 || valorTotalVendas < 0) {
            System.out.println("Valores nao podem ser iguais ou menor que zero.");
            return;
        }

        double valorTotalReceber = salarioFixo + qtdCarrosVendidos * valorPorCarroVendido + valorTotalVendas * 0.05;
        
        System.out.printf("Valor total a receber no mes = R$ %.2f.", valorTotalReceber);
        }
}