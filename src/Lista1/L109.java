package lista1;

import java.util.Scanner;

public class L109 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int qtdHomem = 0, qtdMulher = 0, qtdCriança = 0;
        double consumoHomem, consumoMulher, consumoCriança, total, totalSeguro;

        System.out.print("Digite a quantidade de homens: ");
        qtdHomem = in.nextInt();
        System.out.print("Digite a quantidade de mulheres: ");
        qtdMulher = in.nextInt();
        System.out.print("Digite a quantidade de crianças: ");
        qtdCriança = in.nextInt();

        in.close();

        if (qtdHomem < 0 || qtdMulher < 0 || qtdCriança < 0) {
            System.out.println("Dados invalidos.");
            return;
        }

        consumoHomem = qtdHomem * 0.4;
        consumoMulher = qtdMulher * 0.32;
        consumoCriança = qtdCriança * 0.2;
        total = consumoHomem + consumoMulher + consumoCriança;
        totalSeguro = total * 1.2;

        System.out.printf("Quantidade total de carne para homens = %.2f kg", consumoHomem);
        System.out.printf("\nQuantidade total de carne para mulheres = %.2f kg", consumoMulher);
        System.out.printf("\nQuantidade total de carne para crianças = %.2f kg", consumoCriança);
        System.out.printf("\nTotal = %.2f kg", total);
        System.out.printf("\nTotal com adicional de 20%% = %.2f kg.", totalSeguro);

    }
}