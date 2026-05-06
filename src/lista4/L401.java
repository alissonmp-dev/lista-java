package lista4;

import java.util.Scanner;

public class L401 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = in.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero ; i++) {
            soma = soma + i;
        }

        System.out.println("A soma de 1 até " + numero + " é " +soma);

        in.close();
    }
}