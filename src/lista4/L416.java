/*
Receba um número inteiro positivo, e o seu respectivo expoente inteiro positivo, e apresente o resultado da potência deste número.
Faça isso utilizando o comando while. 
Tenha cuidado com as inicializações!
*/

package lista4;

import java.util.Scanner;

public class L416 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int i = 0;
        int resultado = 1;
        
        System.out.print("INFORME UM NUMERO INTEIRO POSITIVO: ");
        int base = in.nextInt();

        System.out.print("INFORME UM EXPOENTE INTEIRO POSITIVO: ");
        int expoente = in.nextInt();

        
        while ( i < expoente ) {
            resultado = resultado * base;
            i++;
        }            
       
        in.close();

        System.out.println(resultado);
    }
}