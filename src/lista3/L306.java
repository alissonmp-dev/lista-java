package lista3;

import java.util.Scanner;

public class L306 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o nome do time da casa: ");
        String nomeTimeCasa = in.nextLine();

        System.out.print("Digite o nome do time visitante: ");
        String nomeTimeVisitante = in.nextLine();

        System.out.printf("Digite o numero de gols do time %s: ", nomeTimeCasa);
        int golsTimeCasa = in.nextInt();

        System.out.printf("Digite o numero de gols do time %s: ", nomeTimeVisitante);
        int golsTimeVisitante = in.nextInt();

        //(condicao) ? verdadeiro : falso

        String resultadoPartida = (golsTimeCasa == golsTimeVisitante) ? "EMPATE" : (golsTimeCasa > golsTimeVisitante) ? "TIME VENCEDOR: " + nomeTimeCasa : "TIME VENCEDOR: " + nomeTimeVisitante;

        in.close();
        
        System.out.println(resultadoPartida);
    }
}