/*
Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente idade válida, ou seja, o algoritmo deve “validar” a leitura da idade. 
Idade válida tem que ser maior que 0 e menor que 150. Escrever a idade lida.
*/

package lista4;

import java.util.Scanner;

public class L409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME UMA IDADE VALIDA: ");
        int idade = in.nextInt();

        while (idade <= 0 || idade > 150) {        

        System.out.printf("IDADE INVALIDA%nINFORME UMA IDADE VALIDA: ");
        idade = in.nextInt();
        }
        
        System.out.printf("IDADE = %d", idade);

        in.close();
    }
}