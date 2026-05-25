/*
Faça um programa que peça um número inteiro e imprima a série de Fibonacci, sendo o limiteeste número.
Os números de Fibonacci é uma sequência de números naturais, na qual os primeiros dois termos são 0 e 1, e cada termo subsequente corresponde à soma dos dois precedentes.
Por Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, …
*/

package lista6;

import java.util.Scanner;

public class L606 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int primeiroTermo = 0;
        int segundoTermo = 1;
        
        System.out.print("INFORME O LIMITE DA SEQUENCIA DE FIBONACCI: ");
        int limite = in.nextInt();
        
        System.out.print(primeiroTermo + " ");
        System.out.print(segundoTermo + " ");

        for (int i = 0; i < limite - 2; i++) {
            int soma = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = soma;
            System.out.print(primeiroTermo + " ");
        }
        
        in.close();
    }   
}