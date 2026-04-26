package Lista1;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float distancia, velocidadeMedia, tempo;
        
        System.out.print("Digite a distancia e a velocidade media da viagem: ");
        distancia = in.nextFloat();
        velocidadeMedia = in.nextFloat();

        tempo = distancia / velocidadeMedia;

        System.out.println("Tempo = " + tempo + " horas");
        
        in.close();
    }
}
