/*
Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). 
Se o valor lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor.
Após a leitura do valor, escrever o valor lido na tela.
*/

package lista4;

import java.util.Scanner;

public class L406 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = 0;

        while (numero < 1 ||  numero > 10) {
        System.out.println("INFORME UM NUMERO: ");
        numero = in.nextInt();
        }
        
        System.out.println("VALOR = " + numero);

        in.close();
    }
}