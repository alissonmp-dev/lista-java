/*
Faça um programa que receba 3 notas de um aluno, e escolha apenas as duas maiores notas para o cálculo da média.
Apresente a média final, entre as duas maiores notas.
Dica: utilize 3 comandos if.
*/

package lista4;

import java.util.Scanner;

public class L413 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double media;
        double notaFinal1 = 0;
        double notaFinal2 = 0;

        System.out.print("INFORME A NOTA 1: ");
        nota1 = in.nextDouble();

        System.out.print("INFORME A NOTA 2: ");
        nota2 = in.nextDouble();

        System.out.print("INFORME A NOTA 3: ");
        nota3 = in.nextDouble();

        if (nota1 >= nota2 && nota2 >= nota3) {
            notaFinal1 = nota1;
            notaFinal2 = nota2;
        }
        
        if (nota1 >= nota2 && nota3 > nota2) {
            notaFinal1 = nota1;
            notaFinal2 = nota3;
        }

        if (nota2 > nota1 && nota3 >= nota1) {
            notaFinal1 = nota2;
            notaFinal2 = nota3;
        }
        
        media = (notaFinal1 + notaFinal2) / 2;

        System.out.printf("MEDIA = %.2f.", media);

        in.close();
    }
}