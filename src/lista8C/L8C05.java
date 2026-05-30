/*
Dado dois vetores A e B de tamanhos definidos pelo usuário, validar que B é ou não um subconjunto de A. 
Por exemplo, dado A = [1, 2, 3, 4, 5] e B = [1, 3, 5]; B é subconjunto de A.
*/

package lista8C;

import java.util.Scanner;

public class L8C05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("INFORME O TAMANHO DO VETOR A: ");
        int tamanhoVetorA = in.nextInt();

        System.out.print("INFORME O TAMANHO DO VETOR B: ");
        int tamanhoVetorB = in.nextInt();

        System.out.println();

        if (tamanhoVetorB > tamanhoVetorA) {
            System.out.print("VETOR B NÂO É SUBCONJUNTO DO VETOR B");
            System.exit(0);
        }

        int[] vetorA = new int[tamanhoVetorA];
        int[] vetorB = new int[tamanhoVetorB];
        boolean subconjunto = false;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("INFORME O VALOR NA POSIÇÂO " + i + " DO VETOR A: ");
            vetorA[i] = in.nextInt();
        }

        System.out.println();

        for (int j = 0; j < vetorB.length; j++) {
            System.out.print("INFORME O VALOR NA POSIÇÂO " + j + " DO VETOR B: ");
            vetorB[j] = in.nextInt();
        }
        

        System.out.print("\nVetor A = { ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("}");

        System.out.print("Vetor B = { ");
        for (int j = 0; j < vetorB.length; j++) {
            System.out.print(vetorB[j] + " ");
        }
        System.out.println("}\n");

        int acertos = 0;

        for (int j = 0; j < vetorB.length; j++) {
            for ( int i = 0; i < vetorA.length; i++) {
                if (vetorB[j] == vetorA[i]) {
                    acertos++;
                    break;                
                }
            }
        }
        
        subconjunto = (acertos == tamanhoVetorB) ? true : false;
        
        if (subconjunto) {
            System.out.print("VETOR B É SUBCONJUNTO DO VETOR A");
        } else {
            System.out.print("VETOR B NÂO É SUBCONJUNTO DO VETOR A");
        }
        in.close();
    }   
}