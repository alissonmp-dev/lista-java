/*
Faça um programa que peça para o usuário digitar um valor qualquer (inteiro).
Enquanto o valor digitado não for múltiplo 5, o programa continua solicitando ao
usuário para digitar um valor. O programa somente irá encerrar quando o valor
digitado for múltiplo de 5. Para isso, você precisa conhecer o operador utilizado para
o resto da divisão: %. Ele deve ser utilizado da seguinte maneira, por exemplo:
A = B % C;
*/
package lista4;

import java.util.Scanner;

public class L412 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME UM VALOR QUALQUER INTEIRO: ");
        int multiploCinco = in.nextInt();
        
        while (multiploCinco % 5 != 0) {        

        System.out.printf("INFORME UM VALOR DIFERENTE: ");
        multiploCinco = in.nextInt();
        }
        
        System.out.printf("%d É MULTIPLO DE 5", multiploCinco);
        in.close();
    }
}