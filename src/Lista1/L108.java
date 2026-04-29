package lista1;

import java.util.Scanner;

public class L108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalEleitores, votosValidos, votosBrancos, votosNulos, totalVotos;
        double percentualVotosValidos, percentualVotosBrancos, percentualVotosNulos;
        
        System.out.print("Digite o total de eleitores: ");
        totalEleitores = in.nextInt();
        System.out.print("Digite o numero de votos validos: ");
        votosValidos = in.nextInt();
        System.out.print("Digite o numero de votos brancos: ");
        votosBrancos = in.nextInt();
        System.out.print("Digite o numero de votos nulos: ");
        votosNulos = in.nextInt();

        totalVotos = votosBrancos + votosNulos + votosValidos;

        in.close();

        if (totalVotos > totalEleitores) {
            System.out.println("Dados invalidos.");
            return;
        }
                
        percentualVotosValidos = 100 * votosValidos / (double) totalEleitores;
        percentualVotosBrancos = 100 * votosBrancos / (double) totalEleitores;
        percentualVotosNulos = 100 * votosNulos / (double) totalEleitores;

        System.out.printf("Votos validos: %.2f%%.", percentualVotosValidos);
        System.out.printf("\nVotos brancos: %.2f%%.", percentualVotosBrancos);
        System.out.printf("\nVotos nulos: %.2f%%.", percentualVotosNulos);
    }
}