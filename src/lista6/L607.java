/*
Faça um programa que leia para N funcionários o nome, o sexo e o salário.
Em seguida, imprima o maior salário masculino, o maior salário feminino, a média salarial masculina e a média salarial feminina.
*/

package lista6;

import java.util.Scanner;

public class L607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double maiorSalarioMasculino = 0;
        double maiorSalarioFeminino = 0;
        double somaSalarioMasculino = 0;
        double somaSalarioFeminino = 0;
        int qtdHomens = 0;
        int qtdMulheres = 0;

        System.out.print("INFORME O NUMERO DE FUNCIONARIOS: ");
        int qtdFuncionarios = in.nextInt();
        in.nextLine();

        for (int i = 0; i < qtdFuncionarios; i++) {
            System.out.print("INFORME O NOME DO FUNCIONARIO: ");
            String nome = in.nextLine();

            System.out.print("INFORME O SEXO DO FUNCIONARIO. M - MASCULINO; F - FEMININO: ");
            String sexo = in.next().toUpperCase();

            System.out.print("INFORME O SALÁRIO: R$ ");
            double salario = in.nextDouble();
            in.nextLine();

            if (sexo.equals("F")) {
                qtdMulheres++;
                somaSalarioFeminino = somaSalarioFeminino + salario;
                if (salario > maiorSalarioFeminino) {
                    maiorSalarioFeminino = salario;
                }
            } else if (sexo.equals("M")) {
                somaSalarioMasculino = somaSalarioMasculino + salario;
                qtdHomens++;
                if (salario > maiorSalarioMasculino) {
                    maiorSalarioMasculino = salario;
                }
            } else {
                System.out.println("OPCAO INVALIDA");
                System.exit(0);
            }
        }

        double mediaSalariaMasculina = somaSalarioMasculino / qtdHomens;
        double mediaSalariaFeminina = somaSalarioFeminino / qtdMulheres; 

        System.out.printf("%nMAIOR SALARIO MASCULINO: R$ %.2f", maiorSalarioMasculino);
        System.out.printf("%nMAIOR SALARIO FEMININO: R$ %.2f", maiorSalarioFeminino);
        System.out.printf("%nMEDIA SALARIAL MASCULINO: R$ %.2f", mediaSalariaMasculina);
        System.out.printf("%nMEDIA SALARIAL FEMININA: R$ %.2f", mediaSalariaFeminina);

        in.close();
    }   
}