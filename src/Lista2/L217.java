package lista2;

import java.util.Scanner;

public class L217 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o custo de fabrica do carro: R$ ");
        double custoFabrica = in.nextDouble();

        in.close();

        if ( custoFabrica <= 0) {
            System.out.println("Dados invalidos.");
            return;
        }

        double porcentagemDistribuidor = custoFabrica * 0.28;
        double impostosCustoFabrica = custoFabrica * 0.45;

        double custoCarroNovo = custoFabrica + porcentagemDistribuidor + impostosCustoFabrica;

        System.out.printf("Custo total do carro novo: R$ %.2f", custoCarroNovo);
    }
}