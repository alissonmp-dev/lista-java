/*
Fazer um algoritmo que leia um número inteiro e escreva se ele é ou não um
número primo. Um número é primo quando ele é divisível somente por um e por ele
mesmo. Você utilizará uma combinação entre os comandos while e if.
*/
package lista4;

import java.util.Scanner;

public class L415 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 2;
        boolean primo = true;

        System.out.print("INFORME UM NUMERO: ");
        int numero = in.nextInt();

        
        while ( i < numero ) {
            if ( numero % i == 0){
                primo = false;
            }
            i++;            
        }

        if (primo) {
            System.out.println("É PRIMO");
        } else {
            System.out.println("NÃO É PRIMO");
        }
        
        in.close();
    }
}