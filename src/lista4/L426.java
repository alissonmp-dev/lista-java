/*
Existem três candidatos a uma vaga no Senado.
Feita a eleição, os votos são registrados em disco.
O voto de cada eleitor foi codificado da seguinte forma:
Deseja-se saber:
- O número do candidato vencedor;
- O número de votos em branco;
- O número de votos nulos;
- O número de eleitores que compareceram às urnas.
Admite-se que não são possíveis empates.
Então, construa um algoritmo em Java que execute esta tarefa, sabendo que o voto de cada eleitor é lido pelo Scanner.
O voto finalizador tem código –1, e não deve ser computado.
*/

package lista4;

import java.util.Scanner;

public class L426 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int somaVotosCandidatoA = 0;
        int somaVotosCandidatoB = 0;
        int somaVotosCandidatoC = 0;
        int somaVotosBrancos = 0;
        int somaVotosNulos = 0;
        int totalEleitores = 0;
        int votação = 0;
        String vencedor = "";

        System.out.println("UTILIZE AS SEGUINTES OPÇÔES PARA VOTAR: ");
        System.out.println("CANDIDATO A: 1");
        System.out.println("CANDITATO B: 2");
        System.out.println("CANTIDATO C: 3");
        System.out.println("VOTO BRANCO: 4");
        System.out.println("VOTO NULO: 5");
        
        while (votação != -1) {
            System.out.print("SEU VOTO: ");
            votação = in.nextInt();

            if (votação == -1) {
                System.out.println("VOTAÇÂO ENCERRADA.");
            } else if ( votação == 1) {
                somaVotosCandidatoA++;
                totalEleitores++;
            } else if (votação == 2) {
                somaVotosCandidatoB++;
                totalEleitores++;
            } else if (votação == 3) {
                somaVotosCandidatoC++;
                totalEleitores++;
            } else if (votação == 4) {
                somaVotosBrancos++;
                totalEleitores++;
            } else if (votação == 5) {
                somaVotosNulos++;
                totalEleitores++;
            } else {
                System.out.println("OPÇÂO INVALIDA");
            }
        }
        
        
        if ( somaVotosCandidatoA > somaVotosCandidatoB && somaVotosCandidatoA > somaVotosCandidatoC) {
            vencedor = "CANDIDATO A";
        } else if (somaVotosCandidatoB > somaVotosCandidatoA && somaVotosCandidatoB > somaVotosCandidatoC) {
            vencedor = "CANDIDATO B";
        }  else {
            vencedor = "CANDIDATO C";
        }
            
        System.out.println("TOTAL DE ELEITORES: " + totalEleitores);
        System.out.println("TOTAL DE VOTOS BRANCOS: " + somaVotosBrancos);
        System.out.println("TOTAL DE VOTOS NULOS: " + somaVotosNulos);
        System.out.println("O VENCEDOR É O " + vencedor);

        in.close();
    }
}