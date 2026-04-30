package lista2;

import java.util.Scanner;

public class L222 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mensagemFinal;

        System.out.print("Informe o numero da conta: ");
        int numeroConta = in.nextInt();

        System.out.print("Informe o  saldo da conta: R$ ");
        double saldo = in.nextDouble();
        
        System.out.print("Informe o debito da conta: R$ ");
        double debito = in.nextDouble();
        
        System.out.print("Informe o credito da conta: R$ ");
        double credito = in.nextDouble();

        in.close();

        double saldoAtual = saldo - debito + credito;

        if (saldoAtual >= 0) {
            mensagemFinal = "Saldo positivo.";
        } else {
            mensagemFinal = "Saldo negativo.";
        }

        System.out.printf("Saldo atual: R$ %.2f.%nSituação: %s%nNumero da conta: %d", saldoAtual, mensagemFinal, numeroConta);
    }
}