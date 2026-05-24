/*
Escreva um algoritmo em Java que receba vários números e verifique se eles são ou não quadrados perfeitos.
O algoritmo termina a execução quando for digitado um número menor ou igual a 0.
(Um número é quadrado perfeito quando tem um número inteiro como raiz quadrada.).
Obs: não deve ser utilizado métodos da classe Math.
*/

package lista4;

import java.util.Scanner;

public class L425 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 5;
        boolean quadradoPerfeito = false;
        
        while (i > 0) {
            System.out.print("INFORME UM NUMERO: ");
            i = in.nextInt();
            if (i > 0) {
                quadradoPerfeito = false;
                for ( int numero = 0; numero  < i; numero++) {
                    if (numero * numero == i) {
                        quadradoPerfeito = true;
                    } 
                }
                if (quadradoPerfeito) {
                    System.out.println("EH QUADRADO PERFEITO");
                } else {
                    System.out.println("NAO EH QUADRADO PERFEITO");
                }
            }
        }
        in.close();

    }
}