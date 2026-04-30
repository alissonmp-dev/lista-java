package lista1;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, resultado;

        System.out.print("Digite um numero: ");
        numero = in.nextInt();
        resultado = numero * numero;
        System.out.printf("%d² = %d", numero, resultado);

        in.close();
    }
}