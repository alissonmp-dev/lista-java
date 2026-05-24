/*
Escreva um algoritmo para ler 2 valores e, se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor lido não pode ser aceito o valor zero.
Após ler os 2 valores, imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
*/

package lista4;

import java.util.Scanner;

public class L411 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME O PRIMEIRO VALOR: ");
        int primeiroValor = in.nextInt();
        
        System.out.print("INFORME O SEGUNDO VALOR: ");
        int segundoValor = in.nextInt();

        while (segundoValor == 0) {        

        System.out.printf("SEGUNDO VALOR NAO PODE SER ZERO.");
        System.out.printf("%nINFORME UM VALOR VALIDO: ");
        segundoValor = in.nextInt();
        }
        
        double resultado = (double) primeiroValor / segundoValor;

        System.out.printf("RESULTADO DA DIVISAO: %.2f", resultado);
        in.close();
    }
}