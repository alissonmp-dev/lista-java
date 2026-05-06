/*
Faça um programa que receba a 5 notas de um aluno, através do comando while, e
que apresente ao final a média dessas 5 notas. Você deverá ter apenas uma
variável nota, e uma variável média.
*/
package lista4;

import java.util.Scanner;

public class L405 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        double nota = 0;
        double media = 0;

        int i = 1;
        
        while(i <= 5) {
            System.out.println("INFORME A NOTA: ");
            nota = in.nextDouble();

            media = media + nota;
            i++;
        }
    
        media = media / 5;

        System.out.println("MEDIA = " + media);
    
    
    
    
    }}