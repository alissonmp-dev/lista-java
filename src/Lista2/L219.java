package lista2;

import java.util.Scanner;

public class L219 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final double tamanhoCaixaAzulejo = 1.5f;

        System.out.print("Digite o comprimento da cozinha: ");
        double comprimento = in.nextDouble();

        System.out.print("Digite a largura da cozinha: ");
        double largura = in.nextDouble();
        
        System.out.print("Digite a altura da cozinha: ");
        double altura = in.nextDouble();

        in.close();

        if (comprimento <= 0 || altura <= 0 || largura <= 0) {
            System.out.println("Valores invalidos.");
            return;
        }

        double areaTotalCozinha = 2 * comprimento * altura + 2 * largura * altura;

        System.out.printf("Area total da cozinha = %.2f m²", areaTotalCozinha);

        int qtdCaixasAzulejos = (int) ((areaTotalCozinha / tamanhoCaixaAzulejo) + 0.99999);

        System.out.printf("%nQuantidade de caixas necessarias: %d", qtdCaixasAzulejos);
    }
    }