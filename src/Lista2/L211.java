package lista2;

import java.util.Scanner;

public class L211 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = in.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = in.nextDouble();

        in.close();

        double somaNumeros = numero1 + numero2;
        
        if (somaNumeros > 20) {
            System.out.println(somaNumeros + 8);
        } else {
            System.out.println(somaNumeros + 10);
        }

        double r = somaNumeros > 20 ? somaNumeros + 8 : somaNumeros + 10;
        System.out.println(r);
    }
}