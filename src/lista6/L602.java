/*
Solicitar um número inteiro positivo ao usuário, validando a entrada de dados (informando se ele estiver errado e repetindo a solicitação até que esteja correto).
Após o programa deve informar todos os números pares existentes entre 1 e o número fornecido pelo usuário.
Ao final ele pergunte ao usuário se ele deseja informar um outro número.
Caso positivo, o programa deve ser repetido.
Exemplo:
Digite um número inteiro positivo: -8 Valor incorreto!
Digite um número inteiro positivo: 8 Numero digitado: 8
Números inteiros pares entre 1 e 8: 2, 4, 6
Você deseja repetir? Não
*/

package lista6;

import java.util.Scanner;

public class L602 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String repetir = "sim";

        while (repetir.equals("sim")) {
            System.out.print("INFORME UM VALOR INTEIRO POSITIVO: ");
            int valor = in.nextInt();
            
            while (valor <= 0) {
                System.out.println("VALOR NAO POSITIVO");
                valor = in.nextInt();
            }
            
            for (int i = 1; i < valor; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
            System.out.println("DESEJA REPETIR?");
            repetir = in.next();
        }

        

        in.close();
    }
}