package lista3;

import java.util.Scanner;

public class L303 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        double valorA = in.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double valorB = in.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double valorC = in.nextDouble();

        double somaMaiorValores;
        
        in.close();
        
        if (valorA == valorB || 
            valorA == valorC || 
            valorB == valorC) {
            System.out.print("Valores nao podem ser iguais.");
            return;
        }

        if (valorA > valorB) {
            if (valorB > valorC) {
                somaMaiorValores = valorA + valorB;
            } else {
                somaMaiorValores = valorA + valorC;
            }
        } else {
            if (valorA > valorC) {
                somaMaiorValores = valorB + valorA;
            } else {
                somaMaiorValores = valorB + valorC;
            }
        }

        System.out.println("A soma dos maiores numeros é " + somaMaiorValores);
    }
}