/*
Faça um programa que leia valores inteiros positivos do usuário até que seja digitado um valor maior queo dobro do anterior.
*/

package lista6;

import java.util.Scanner;

public class L608 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME UM VALOR: ");
        int anterior = in.nextInt();
        
        int valor = anterior;

        while (valor <= anterior * 2) {
            anterior = valor;
            System.out.print("INFORME UM VALOR INTEIRO POSITIVO: ");
            valor = in.nextInt();
        }
        in.close();
    }   
}