/*
Ler um vetor com 10 nomes de pessoas, após pedir que o usuário digite um nome qualquer de pessoa.
Escrever a mensagem “ACHEI”, se o nome estiver armazenado no vetor C ou “NÃO ACHEI” caso contrário.
Repita o comportamento até que o usuário digite a palavra FIM.
*/

package lista8C;

import java.util.Scanner;

public class L8C03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] vetor = new String[]{"Alisson", "Kerolyn", "Caitlyn","Isabella","Niklaus","Bruce","Penelope","João","Gerusa"};

        String objetivo = "";
        boolean achei = false;

        while (!objetivo.equalsIgnoreCase("FIM")) {
            achei = false;
            System.out.print("INFORME UM NOME: ");
            objetivo = in.next();

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i].equalsIgnoreCase(objetivo)) {
                    achei = true;
                    break;
                }
            }

            if (objetivo.equalsIgnoreCase("FIM")) {
                break;
            }

            if (achei == true) {
                System.out.println("NOME ENCONTRADO");
            } else {
                System.out.println("NOME NAO ENCONTRADO");
            }
        }
 
        in.close();
    }   
}