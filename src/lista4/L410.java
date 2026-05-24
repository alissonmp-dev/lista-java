/*
Escreva um algoritmo para ler um salário.
O algoritmo deve “validar” a leitura do salário para aceitar somente um “salário válido”. 
Você deve definir o que é um “salário válido”. Escrever o salário lido
*/

package lista4;

import java.util.Scanner;

public class L410 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("VALOR MINIMO DO SALARIO: R$ ");
        double valorMinimoSalario = in.nextDouble();

        System.out.print("VALOR MAXIMO DO SALARIO: R$ ");
        double valorMaximoSalario = in.nextDouble();
        
        System.out.print("INFORME UM SALARIO VALIDO: ");
        double salario = in.nextDouble();

        while (salario < valorMinimoSalario || salario > valorMaximoSalario) {        

        System.out.printf("SALARIO INVALIDO%nINFORME UM SALARIO VALIDO: ");
        salario = in.nextDouble();
        }
        
        System.out.printf("SALARIO = R$ %.2f", salario);

        in.close();
    }
}