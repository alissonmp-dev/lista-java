package lista1;

import java.util.Scanner;

public class L110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valorIngresso, valorIngressoSocio, valorArrecadado, valorArrecadoSemDescontos;
        int qtdSocios, qtdNaoPagantes, qtdPagantesSemDesconto, publicoTotal;
        
        System.out.print("Informe o valor do ingresso: R$ ");
        valorIngresso = in.nextDouble();
        System.out.print("Informe a quantidade de socios no evento: ");
        qtdSocios = in.nextInt();
        System.out.print("Informe a quantidade de publico nao pagante no evento: ");
        qtdNaoPagantes = in.nextInt();
        System.out.print("Informe a quantidade de publico sem desconto algum no evento: ");
        qtdPagantesSemDesconto = in.nextInt();

        valorIngressoSocio = valorIngresso * 0.7;
        publicoTotal = qtdSocios + qtdNaoPagantes + qtdPagantesSemDesconto;
        valorArrecadado = qtdSocios * valorIngressoSocio + qtdPagantesSemDesconto * valorIngresso;
        valorArrecadoSemDescontos = publicoTotal * valorIngresso;

        System.out.printf("Valor do ingresso é R$ %.2f", valorIngresso);
        System.out.printf("\nValor do ingresso para socios é R$ %.2f", valorIngressoSocio);
        System.out.println("\nPublico total do evento = " + publicoTotal);
        System.out.printf("Valor arrecadado = R$ %.2f", valorArrecadado);
        System.out.printf("\nValor que seria arrecadado sem descontos = R$ %.2f", valorArrecadoSemDescontos);
    }
}