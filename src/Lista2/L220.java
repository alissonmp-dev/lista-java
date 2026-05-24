package lista2;

import java.util.Scanner;

public class L220 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final double PRECO_COMBUSTIVEL = 4.599;
        
        System.out.print("Digite a marcação do odometro no inicio do dia: ");
        double odometroInicioDia = in.nextDouble();

        System.out.print("Digite a marcação do odometro no final do dia: ");
        double odometroFinalDia = in.nextDouble();

        if(odometroFinalDia < odometroInicioDia) {
            System.out.println("Odometro final do dia nao pode ser menor que o odometro do inicio do dia.");
            in.close();
            return;
        }

        System.out.print("Digite a quantidade de combustivel gasto: ");
        double litrosCombustivelGasto = in.nextDouble();

        System.out.print("Digite o valor total recebido pelos passageiros: R$ ");
        double valorTotalRecebidoPassageiros = in.nextDouble();

        if(litrosCombustivelGasto <= 0 || valorTotalRecebidoPassageiros < 0) {
            System.out.println("Valores nao podem ser <= zero.");
            in.close();
            return;
        }
        
        double mediaConsumoKmL = (odometroFinalDia - odometroInicioDia) / litrosCombustivelGasto;
        double lucroLiquido = valorTotalRecebidoPassageiros - litrosCombustivelGasto * PRECO_COMBUSTIVEL;

        System.out.printf("%nMedia de consumo por Km/L: %.2f", mediaConsumoKmL);
        System.out.printf("%nLucro liquido R$ %.2f.", lucroLiquido);

        in.close();
    }
}
