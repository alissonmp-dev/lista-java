/*
Faça um programa que começa com um array pré-definido com 5 valores, o usuário deve acertar os 5 valores durante a execução do programa.
O programa deve terminar quando todos os valores forem acertados. 
Dica: utilize um array extra
*/

package lista8;

import java.util.Scanner;

public class L809 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[] {10, 20, 30, 40, 50};
        int[] vetorAux = new int[5];
        
        boolean todosAcertados = false;
        int acertos = 0;
    
        while (!todosAcertados) {
            acertos = 0;
            for (int i = 0; i < vetorAux.length; i++) {
                System.out.print("TENTE ADIVINHAR OS VALORES DO VETOR: ");
                vetorAux[i] = in.nextInt();
            }

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == vetorAux[i]) {
                    acertos++;
                }
            }

            if (acertos == 5) {
                todosAcertados = true;
            } else {
                System.out.println("QUANTIDADE DE ACERTOS = " + acertos);
            }
        }
        in.close();
    }
}