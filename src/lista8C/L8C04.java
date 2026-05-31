/*
Dados dois vetores de tamanho N, faça um programa que diga se ambos possuem os mesmos valores (posição por posição).
*/

package lista8C;

import java.util.Scanner;

public class L8C04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor1 = new int[]{1,2,3,4,5};
        int[] vetor2 = new int[]{1,6,3,4,5};

        boolean iguais = true;

        for (int i : vetor1) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : vetor2) {
            System.out.print(i + " ");
        }
        
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != vetor2[i]) {
                iguais = false;
                break;
            }
        }
        System.out.println();

        if (iguais) {
            System.out.println("IGUAIS");
        } else {
            System.out.println("DIFERENTES");
        }

        in.close();
    }   
}