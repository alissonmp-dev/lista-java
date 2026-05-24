package lista2;

//nao sei, voltardepois

import java.util.Scanner;

public class L221verificar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Comprimento da pista em metros: ");
        double comprimentoPista = in.nextDouble();

        System.out.print("Total de voltas: ");
        int qtdVoltas = in.nextInt();

        System.out.print("Numero de reabastecimento desejados: ");
        int paradasAbastecer = in.nextInt();

        System.out.print("Consumo do carro em Km/L: ");
        double consumoCarro = in.nextDouble();
        
        //se tiver 1 parada, a corrida tera 2 partes

        int trechosCorrida = paradasAbastecer + 1;

        int voltasPorTrecho = qtdVoltas / trechosCorrida;

        double distanciaVoltasPorTrecho = comprimentoPista;
        in.close();
    }
}