/*
Faça um programa, utilizando vetores, que armazene o resultado de uma votação.
Considere que você tem 5 candidatos, e para cada voto, você deverá digitar 1, 2, 3,
4 ou 5. que correspondem aos códigos de cada candidato. O programa deve parar
de receber votos quando for digitado -1. Outros valores devem ser ignorados. No
Final, indique qual o candidato vencedor da votação.
*/

package lista8;

import java.util.Scanner;

public class L807 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] votos = new int[]{0,0,0,0,0};

        int candidato = 7;
        int maisVotos = 0;
        
        while (candidato != -1) {
            System.out.print("INFORME SEU VOTO: ");
            candidato = in.nextInt();
            if(candidato == 1) {
                    votos[0]++;
                } else if ( candidato == 2) {
                    votos[1]++;
                } else if (candidato == 3) {
                    votos[2]++;
                } else if (candidato == 4) {
                    votos[3]++;
                } else if (candidato == 5) {
                    votos[4]++;
                } else if (candidato == -1) {
                    break;
                } else {
                    System.out.println("CANDIDATO INVALIDO!");
                }
        }
            
        for (int i = 0; i < votos.length; i++) {
            System.out.println("CANDIDATO " + (i + 1) + ": "+ votos[i]);
        }

        for (int i = 0; i < votos.length; i++) {
            if (votos[i] > maisVotos) {
                maisVotos = votos[i];
            }
        }


        for (int i = 0; i < votos.length; i++) {
            if (votos[i] == maisVotos) {
                System.out.println("O VENCEDOR È O CANDIDATO " + (i+1));
                break;
            }
        }
        in.close();
    }
}