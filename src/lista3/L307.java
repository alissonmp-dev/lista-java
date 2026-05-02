package lista3;

import java.util.Scanner;

public class L307 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o numero de litros vendido: ");
        double litros = in.nextDouble();

        System.out.printf("Digite o tipo de combustivel.%nA - Álcool %nG - Gasolina%n");
        String tipoCombustivelValor = in.next();

        String tipoCombustivel;
        final double VALOR_ALCOOL = 3.90;
        final double VALOR_GASOLINA = 4.30;
        double desconto;
        double valorPago;

        if(tipoCombustivelValor.equalsIgnoreCase("A")) {
            //equalsIgnoreCase para ignorar letra maiscula ou minuscula
            tipoCombustivel = "ÁLCOOL";
            if (litros <= 20) {
                desconto = 0.97;
                valorPago = VALOR_ALCOOL * litros * desconto;
            } else {
                desconto = 0.95;
                valorPago = VALOR_ALCOOL * litros * desconto;
            }
        } else if (tipoCombustivelValor.equalsIgnoreCase("G")) {
            tipoCombustivel = "GASOLINA";
            if (litros <= 20) {
                desconto = 0.96;
                valorPago = VALOR_GASOLINA * litros * desconto;
            } else {
                desconto = 0.94;
                valorPago = VALOR_GASOLINA * litros * desconto;
            }
        } else {
            System.out.println("Valor invalido.");
            in.close();
            return;
        }

        System.out.printf("%.2f litros de %s.%n", litros, tipoCombustivel);
        System.out.printf("Valor a ser pago = R$ %.2f", valorPago);

        in.close();
    }
}