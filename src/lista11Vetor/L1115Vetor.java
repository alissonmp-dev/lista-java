/*
Leia um vetor com 20 numeros inteiros. 
Escreva os elementos do vetor eliminando elementos repetidos.
*/

package lista11Vetor;

import java.util.Random;
import java.util.Scanner;

public class L1115Vetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[]{1,1,2,2,3,4,5,1,5,6,7,8};
        Random random = new Random();


        /*
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("INFORME A NOTA DO ALUNO " + i + ": ");
            vetor[i] = in.nextInt();
        }
        */

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(5); 
        }

        for (int i : vetor) {
            System.out.print(i + " ");
        }

        
        in.close();
    }   
}