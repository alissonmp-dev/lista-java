package lista2;

import java.util.Scanner;

public class L212 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double preçoMaça = 0;
        double valorMaça = 0; 


        System.out.print("Digite a quantidade de maças: ");
        int qtdMaças = in.nextInt();

        in.close();

        if (qtdMaças < 0) {
            System.out.println("Quantidade invalida.");
            return;
        } else if (qtdMaças < 12) {
            preçoMaça = 1.5;
        } else {
            preçoMaça = 1.2;
        }

        valorMaça = preçoMaça * qtdMaças;

        System.out.printf("Custo total da compra: R$ %.2f.", valorMaça);
    }
}