/*
Escreva uma palavra, letra por letra, colocando cada letra em um vetor.
Ao final, imprima na tela a palavra digitada, com o formato de uma palavra (uma letra após a outra).
*/

package lista8;

import java.util.Scanner;

public class L806 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("ESCREVA UMA PALAVRA: ");
        String palavra = in.next();

        System.out.println("TAMANHO DA PALAVRA: " + palavra.length());

        char[] vetor = new char[palavra.length()];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = palavra.charAt(i);
        }

        for ( int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
        }

        in.close();
    }    
}