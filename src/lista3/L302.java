package lista3;

import java.util.Scanner;

public class L302 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        double valorA = in.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double valorB = in.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double valorC = in.nextDouble();

        double maiorValor;
        
        in.close();
        
        if (valorA == valorB || 
            valorA == valorC || 
            valorB == valorC) {
            System.out.print("Valores nao podem ser iguais.");
            return;
        }

        if (valorA > valorB && valorA > valorC) {
            maiorValor = valorA;
        } else if (valorB > valorA && valorB > valorC) {
            maiorValor = valorB;
        } else {
            maiorValor = valorC;
        }

        System.out.println("O maior valor é " + maiorValor);
    }    
}