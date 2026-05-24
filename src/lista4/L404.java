/*
Escreva um programa que apresente quatro opções: 
(a) consulta saldo, 
(b) saque
(c) depósito
(d) sair. 
O saldo deve iniciar em R$ 0,00.
 A cada saque ou depósito o valor do saldo deve ser atualizado. 
*/

package lista4;

import java.util.Scanner;

public class L404 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double saque;
        double deposito;
        double saldo = 0;
        char opcao = ' ';

        while (opcao != 'D') {
            System.out.printf("----------------------------%nInforme a operação desejada: %n");
            System.out.printf("%nA - CONSULTA SALDO%nB - SAQUE%nC - DEPOSITO%nD - SAIR%n");
            opcao = in.next().toUpperCase().charAt(0);

            switch (opcao) {
                case 'A':
                    System.out.printf("CONSULTA SALDO: R$ %.2f", saldo);
                    break;
                    
                case 'B':
                    System.out.println("OPÇÃO: SAQUE");
                    System.out.printf("%nInforme o valor a ser retirado da conta: R$ ");
                    saque = in.nextDouble();
                    saldo = saldo - saque;
                    break;

                case 'C':
                    System.out.println("OPÇÃO: DEPOSITO");
                    System.out.print("Informe o valor a ser depositado: R$ ");
                    deposito = in.nextDouble();
                    saldo = deposito + saldo;
                    break;

                case 'D':
                    System.out.println("SAIR");
                    break;

                default: 
                    System.out.println("OPÇÂO INVALIDA");
                    break;
                }
            }
            in.close();
        }
    }