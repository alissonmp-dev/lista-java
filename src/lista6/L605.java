/*
Implementar um algoritmo para calcular o valor de e^x. 
O valor de X deverá ser digitado.
O valor de exserá calculado pela soma dos 10 primeiros termos da série a seguir: 
e^x = 1 + x + x²/2! + x³/3! + x⁴/4! + ...
sabe-se que: 0! é igual a 1.
*/

package lista6;

import java.util.Scanner;

public class L605 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double soma = 1;
        double divisao = 1;
        int fatorial = 1;
        double potencia = 1;

        System.out.print("INFORME O VALOR DO EXPOENTE: ");
        int expoente = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            potencia = potencia * expoente;
            fatorial = i * fatorial;
            divisao = (double) potencia / fatorial;
            System.out.println(fatorial);
            System.out.println(divisao);

            soma = soma + divisao;
            
        }

        System.out.println("E = " + soma);
        
        in.close();
    }   
}