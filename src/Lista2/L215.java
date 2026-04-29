package lista2;

import java.util.Scanner;

public class L215 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int duraçãoPartida;

        System.out.print("Digite a hora do começo do jogo: ");
        int horaInicial = in.nextInt();

        System.out.print("Digite a hora do fim do jogo: ");
        int horaFinal = in.nextInt();

        in.close();
        
        if(horaFinal > horaInicial) {
            duraçãoPartida = horaFinal - horaInicial;
        } else {
            duraçãoPartida = (24 - horaInicial) + horaFinal;
        }
        
        System.out.printf("Duração da partida foi de %d horas.", duraçãoPartida);
    }
}